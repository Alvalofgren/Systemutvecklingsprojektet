/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemutvecklingsprojektet;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *

 * @author Julius
 */
public class Validering {
  private InfDB idb;
/**
 * Metoden kontrollTextFältVärde kontrollerar olika textfält och de värden som matas in. Det kan handla om att logga in i systemet
 * eller att registrera agenter, aliens eller utrusning. Denna metod specificierar sig och kontrollerar att om rutorna är 
 * tomma ska ett felmeddelande komma upp. Metoderna i den här klassen använder vi oss av i andra klasser för att göra
 * olika valideringar.
 * @param aktuellRuta
 * @return 
 */ 
public Validering (InfDB idb)
        {
            this.idb=idb;
        }
  
public static boolean kontrollTextFältVärde (JTextField aktuellRuta)
    {
        boolean tom = true;
                
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Skriv in något i rutan/rutorna!");
            tom = false;
            aktuellRuta.requestFocus();
        }
        return tom;
    }

/**
 * Nästa metod som är nedanför kontrollerar denna gång om det som skrivs in i ett textfält är av ett heltal. I de olika klasserna
 * för reigstrering av olika slag ska man registrera telefon nummer i vissa fall och då används den här metoden.
 * @param aktuellRuta
 * @return 
 */

 public static boolean harHeltal(JTextField aktuellRuta)
           {
               boolean resultat = true;
               try
               {
                   String heltal = aktuellRuta.getText();
                   Integer.parseInt(heltal);
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
     * Nästa metod validerar så att rutorna i två textfält matchar
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
                    JOptionPane.showMessageDialog(null, "Textfälten matchar inte");              
                }
       return matchar;
       
   }
    
    public static boolean telefonÄrGiltig (JTextField aktuellRuta)
    {
       boolean giltig = false;
       
        if(!aktuellRuta.getText().matches("[a-zA-Z]") && aktuellRuta.getText().matches("[0-9]") || aktuellRuta.getText().contains("-"))
        {
            giltig = true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ange ett giltigt telefonnummer");
        }
        return giltig;
    }
   
              
}