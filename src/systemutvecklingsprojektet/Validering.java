/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemutvecklingsprojektet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfException;
/**
 *

 * @author Julius
 */
public class Validering {
  
   
public static boolean kontrollTextFältVärde (JTextField aktuellRuta)
    {
        boolean tom = true;
                
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Skriv in något i rutan!");
            tom = false;
            aktuellRuta.requestFocus();
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
 
 public static boolean ärEnString(JTextField aktuellRuta)
 {
     boolean resultat = true; 
     try 
     {
         String enSträng = aktuellRuta.getText();
         //Hur fortsätta??
         
     }
     catch(NumberFormatException undantag)
     {
         JOptionPane.showMessageDialog(null, "Ange en sträng");
         resultat = false;
     }
     return resultat; 
 }
    
    
    public static boolean rutornaMatchar(JTextField aktuellRuta, JTextField aktuellRuta2)
   {
       boolean matchar = false;
       
       if(aktuellRuta.getText().equals(aktuellRuta2.getText())){              
           matchar = true;
           }
       else 
                {
                    JOptionPane.showMessageDialog(null, "Textfälten matchar inte");              
                }
       return matchar;
       
   }
}