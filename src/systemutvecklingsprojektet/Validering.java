/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemutvecklingsprojektet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *

 * @author Julius
 */
public class Validering {
  
   
public static boolean kontrollTextF�ltV�rde (JTextField aktuellRuta)
    {
        boolean tom = true;
                
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Skriv in n�got i rutan/rutorna!");
            tom = false;
            aktuellRuta.requestFocus();
        }
        return tom;
    }

public static boolean isValidMobileNo(String str)  
{  
    Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
    
    Matcher match = ptrn.matcher(str); 
    
    return (match.find() && match.group().equals(str)); 
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