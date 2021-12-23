/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemutvecklingsprojektet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *

 * @author Julius
 */
public class Validering {
  
   
public static boolean kontrollTomtTextFält (JTextField rutaKontrolleras)
    {
        boolean tom = false;
                
        if(rutaKontrolleras.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Skriv in något i rutan!");
            tom = true;
        }    
        return tom;
    }
  
      
 public static boolean harHeltal(JTextField aktuellRuta)
           {
               boolean resultat = true;
               try
               {
                   String enSträng = aktuellRuta.getText();
                   Integer.parseInt(enSträng);
                   aktuellRuta.requestFocus();
               }
               
               catch(NumberFormatException undantag)
               {
                   JOptionPane.showMessageDialog(null, "Ange ett heltal");
                   resultat = false;
               }
               return resultat;
           }
    
    /**
     *
     * @param aktuellRuta
     * @return
     */
    public boolean rutornaMatchar(JTextField aktuellRuta)
   {
       boolean matchar = true;
       
       try
       {
           if(fältNyttLösenord.getText().equals(fältBekräftaLösenord.getText()))
           {
                new lösenordÄndrat().setVisible(true);
           }
       }  
        catch(Exception undantag)
                {
                    JOptionPane.showMessageDialog(null, "Rutorna matchar inte");
                }
       return matchar;
       
   }
    
    
    
   
 

 

  private javax.swing.JTextField fältBekräftaLösenord;
   private javax.swing.JTextField fältNyttLösenord;
}