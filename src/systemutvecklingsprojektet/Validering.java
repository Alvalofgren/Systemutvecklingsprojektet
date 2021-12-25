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
     * @param aktuellRuta2
     * @return
     */
    public static boolean rutornaMatchar(JTextField aktuellRuta, JTextField aktuellRuta2)
   {
       boolean matchar = false;
       
       if(aktuellRuta.getText().equals(aktuellRuta2.getText())){              
           matchar = true;
           }
       else 
                {
                    JOptionPane.showMessageDialog(null, "Rutorna matchar inte");              
                }
       return matchar;
       
   }
}