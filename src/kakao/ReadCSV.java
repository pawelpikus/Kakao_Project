/*
 * KAKAO System Planowania Wysylek
 * by Pawel Pikus, Tomasz Pudlo
 */
package kakao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * reading from a .csv file
 */
public class ReadCSV {
    
    public void run(){
        String csvFile = "data1.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        
        try {
            Map<String, String> maps = new HashMap<String, String>();
            br = new BufferedReader (new FileReader(csvFile));
            while ((line = br.readLine())!=null) {
                //use comma as separator
                String [] data = line.split(csvSplitBy);
                maps.put(data[2], data[3]);
                
            }
            
            //loop map
            
            for (Map.Entry<String, String> entry : maps.entrySet()) {
                System.out.println("Artykul [Art No = " + entry.getKey() + " , Description = " 
                        + entry.getValue() + "]");
                
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
