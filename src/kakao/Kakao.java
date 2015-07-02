/*
 * KAKAO System Planowania Wysylek
 * by Pawel Pikus, Tomasz Pudlo
 */
package kakao;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Lusiotron2015
 */
public class Kakao {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        String sUrlString = "jdbc:sqlite:Cocoa_v2.db";
        KakaoDb kakaoDb = new KakaoDb("org.sqlite.JDBC", sUrlString);
        ReadCSV obj = new ReadCSV();
        //obj.czysc_tabele("Kraje");
	//obj.uzupelnij_tabele(6, 6, "Kraje");
        obj.czysc_tabele("Artykuly");
        obj.uzupelnij_tabele(2, 3, "Artykuly (numer_artykulu, nazwa_artykulu)");
        
        /*
        JFrame ramka_glowna = new JFrame("Projekt Kakao v0.1");
        ramka_glowna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka_glowna.setSize(400, 400);
        ramka_glowna.pack();
        ramka_glowna.setVisible(true);
        */
        
        ReadFromDb odczyt = new ReadFromDb();
        String[] nazwy_kolumn_artykuly = {"numer_artykulu", "nazwa_artykulu", "ilosc_paletowa"};
        odczyt.pelny_odczyt("Artykuly", 3, nazwy_kolumn_artykuly);
        
        
        
    }       
}
