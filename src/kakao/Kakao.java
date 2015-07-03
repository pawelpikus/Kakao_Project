/*
 * KAKAO System Planowania Wysylek
 * by Pawel Pikus, Tomasz Pudlo
 */
package kakao;

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
        
        //formatka z logowaniem
        LoginPage loginPage = new LoginPage();
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPage.setSize(400,400);
        loginPage.pack();
        loginPage.setVisible(true);
       
       //String sUrlString = "jdbc:sqlite:Cocoa_v2.db";
       //KakaoDb kakaoDb = new KakaoDb("org.sqlite.JDBC", sUrlString);
       //kakaoDb.getConnection();
       //ReadCSV obj = new ReadCSV();
       
        
        //obj.czysc_tabele("Kraje");
	//obj.uzupelnij_tabele(6, 6, "Kraje");
        //ReadCSV.czysc_tabele("Artykuly");
        //obj.uzupelnij_tabele(2, 3, "Artykuly");
        
//        ReadFromDb odczyt = new ReadFromDb();
//        String[] nazwy_kolumn_artykuly = {"numer_artykulu", "nazwa_artykulu", "ilosc_paletowa"};
//        odczyt.pelny_odczyt("Artykuly", 3, nazwy_kolumn_artykuly);
        
        
        
        
        
        
    }       
}
