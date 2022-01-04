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
  
   
public static boolean kontrollTextF�ltV�rde (JTextField aktuellRuta)
    {
        boolean tom = true;
                
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Skriv in n�got i rutan!");
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
 
 public static boolean �rEnString(JTextField aktuellRuta)
 {
     boolean resultat = true; 
     try 
     {
         String enStr�ng = aktuellRuta.getText();
         //Hur forts�tta??
         
     }
     catch(NumberFormatException undantag)
     {
         JOptionPane.showMessageDialog(null, "Ange en str�ng");
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
                    JOptionPane.showMessageDialog(null, "Textf�lten matchar inte");              
                }
       return matchar;
       
   }
}