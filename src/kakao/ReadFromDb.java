/*
 * KAKAO System Planowania Wysy�ek
 * by Pawe� Pikus, Tomasz Pud�o
 */
package kakao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import static kakao.Sqlite.conn;

/**
 *
 * @author laptop
 */
public class ReadFromDb {
    
    
    
    public static String tablica[][];
    
    public void pelny_odczyt (String nazwa_tabeli, int liczba_kolumn, String[] nazwy_kolumn) throws SQLException, ClassNotFoundException
        {
        if (conn != null)
            {
            System.out.println("Connected OK");
            } else  
                {System.out.println("Connection failed");}
        
        Statement stat = conn.createStatement();
        
        int w = 0;
        int k = liczba_kolumn;
        
        ResultSet rs1 = stat.executeQuery("select count(numer_artykulu) as total from " + nazwa_tabeli);
        w = rs1.getInt("total");
        rs1.close();
        
        System.out.println(w + " " + k);
        
        tablica = new String[w][k];
        int r = 0;
        int c = 0;
        
        ResultSet rs = stat.executeQuery("select * from " + nazwa_tabeli);
        while (rs.next()) 
        {
            for (int n = 0; n < nazwy_kolumn.length; n++)
            {
                tablica[r][c] = rs.getString(nazwy_kolumn[n]);
                c++;
            }
            r++;
            c=0;
        }
        rs.close();
        conn.close();
        
        
        // tak mozna wyświetlić otrzymaną tabelę
        
        for (int i=0; i < w; i++)
        {
            for (int j = 0; j < k; j++)
            {
                System.out.print(tablica[i][j] + ", ");
            }
            System.out.println();
        }
        
        }
}
