package systemutvecklingsprojektet;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author alval
 */
public class StartKlass {
   private static InfDB idb;
   
   public static void main(String[] args)
   {
       try {
            idb = new InfDB("mibdba, 3306, mibdb, mibdba");
            System.out.println("funka");
        } catch (InfException ettUndantag) {
           JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
       
       new Fonster(idb).setVisible(true);
              
             
   
  
    }
    
}
