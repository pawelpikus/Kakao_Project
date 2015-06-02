/*
 * KAKAO System Planowania Wysylek
 * by Pawel Pikus, Tomasz Pudlo
 */
package kakao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import static kakao.Sqlite.conn;

/**
 *
 * reading from a .csv file and use prepared statement to modify db
 */
public class ReadCSV {
   
    
    
    public void run() throws SQLException, ClassNotFoundException{
        String csvFile = "data1.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        int i=0;
        
        if (conn!= null)
        {
            System.out.println("Connected OK");
        } else {
            System.out.println("Connection failed");
        }

        try {
            Map<String, String> maps = new HashMap<String, String>();
            br = new BufferedReader (new FileReader(csvFile));
            while ((line = br.readLine())!=null) {
                //use comma as separator
                String [] data = line.split(csvSplitBy);
                maps.put(data[6], data[6]); //key and value columns in .csv
                
            }
            
            //loop map
            
            for (Map.Entry<String, String> entry : maps.entrySet()) {
                System.out.println("Data1  , Column = " 
                        + entry.getValue() + "]");
            
                /* insert using prepared statement
                PreparedStatement prep = conn.prepareStatement("insert into Kraje values(?,?);");
                
                prep.setInt(1, i);
                i++;
                
                prep.setString(2, entry.getValue());
                
                prep.execute();
                
                */
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br !=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Done");
               
    }
    
}
