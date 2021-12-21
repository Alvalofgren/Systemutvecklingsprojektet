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
       try
       {
           idb = new InfDB("mibdba", "3306", "mibdb", "mibdba");
           
       }

        catch(InfException felUppgifter)
                {
                    JOptionPane.showMessageDialog(null, "något gick fel");
                    System.out.println("Felmeddelande" + felUppgifter.getMessage());
                }
       
       new Fonster(idb).setVisible(true);
              
             
   
  
    }
    
}
