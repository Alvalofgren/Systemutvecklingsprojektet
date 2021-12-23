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
    
   public static boolean finnsText(JTextField aktuellRuta)
   {
       boolean resultat = true;
       if(aktuellRuta.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Det finns ingen text i rutan!!!");
           resultat = false;
           aktuellRuta.requestFocus();
           
       }
       return resultat;
   }
    
   public static boolean harHeltal(JTextField aktuellRuta)
           {
               boolean resultat = true;
               try
               {
                   String enStr�ng = aktuellRuta.getText();
                   Integer.parseInt(enStr�ng);
                   aktuellRuta.requestFocus();
               }
               
               catch(NumberFormatException undantag)
               {
                   JOptionPane.showMessageDialog(null, "Ange ett heltal");
                   resultat = false;
               }
               return resultat;
           }
    
   public boolean rutornaMatchar(JTextField aktuellRuta)
   {
       boolean matchar = true;
       
       try
       {
           if(f�ltNyttL�senord.getText().equals(f�ltBekr�ftaL�senord.getText()))
           {
                new l�senord�ndrat().setVisible(true);
           }
       }  
        catch(Exception undantag)
                {
                    JOptionPane.showMessageDialog(null, "Rutorna matchar inte");
                }
       return matchar;
       
   }
    
    
    
   
   private javax.swing.JTextField f�ltBekr�ftaL�senord;
   private javax.swing.JTextField f�ltNyttL�senord;

 
public class Validering {
    
    
    public static boolean kontrollTomtTextF�lt (JTextField rutaKontrolleras)
    {
        boolean tom = false;
                
        if(rutaKontrolleras.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Skriv in n�got i rutan!");
            tom = true;
        }    
        return tom;
    }

