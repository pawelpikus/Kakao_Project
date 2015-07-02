/*
 * KAKAO System Planowania Wysylek
 * by Pawel Pikus, Tomasz Pudlo
 */
package kakao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import static kakao.Sqlite.conn;

/**
 *
 * reading from a .csv file and use prepared statement to modify db
 */
public class ReadCSV {
   
    public void czysc_tabele (String nazwa_tabeli) throws SQLException, ClassNotFoundException
        {
        // czyscimy zawartosc tabeli
            PreparedStatement czysc = conn.prepareStatement("delete from " + nazwa_tabeli + ";");
            czysc.execute();
            System.out.println("Wyczyszczono tabele " + nazwa_tabeli + ".");
        };
    
    
    public void uzupelnij_tabele(int numer_kolumny_klucza, int numer_kolumny_wartosci, String nazwa_tabeli) throws SQLException, ClassNotFoundException{
        String csvFile = "data1.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        // int i=0;
        //String kolumna = "Kraje";
        
        if (conn != null)
        {
            System.out.println("Connected OK");
        } else {
            System.out.println("Connection failed");
        }

        try 
        {    
            Map<String, String> maps = new HashMap<String, String>();
            br = new BufferedReader (new FileReader(csvFile));
            //br.readLine(); // this will read the first line
            while ((line = br.readLine())!=null) 
                {
                //use comma as separator
                String [] data = line.split(csvSplitBy);
                maps.put(data[numer_kolumny_klucza], data[numer_kolumny_wartosci]); //key and value columns in .csv
                               
                }
            
            /*
            // czyscimy zawartosc tabeli
            PreparedStatement czysc = conn.prepareStatement("delete from " + nazwa_tabeli + ";");
            czysc.execute();
            System.out.println("Wyczyszczono tabele" + nazwa_tabeli + ".");
            */
            
            //loop map
            
            for (Map.Entry<String, String> entry : maps.entrySet()) 
                {
                System.out.println("Do tabeli " + nazwa_tabeli + " wstawiono: [" 
                        + entry.getKey() + ", " + entry.getValue() + "]");
            
                // insert using prepared statement
                PreparedStatement prep = conn.prepareStatement("insert into " + nazwa_tabeli + " values(?,?);");                
                prep.setString(1, entry.getKey());             
                prep.setString(2, entry.getValue());                
                prep.execute();
                }
            
        } catch (FileNotFoundException e) 
            {
            e.printStackTrace();
            }
        catch (IOException e) 
            {
            e.printStackTrace();
            } 
        finally 
            {
            if (br !=null) 
                {
                try {br.close();}
                catch (IOException e) {e.printStackTrace();}
                }
            }   
        System.out.println("Done");
               
    }
    
}
