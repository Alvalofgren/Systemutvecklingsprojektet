package systemutvecklingsprojektet;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author alval
 */
public class StartKlass 
{

    private static InfDB idb;

    public static void main(String[] args)
    {
        try 
        {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

        } 
        catch (InfException felUppgifter) 
        {
            System.out.println("Felmeddelande" + felUppgifter.getMessage());
        }

        new Fonster(idb).setVisible(true);

    }

}
