/*
 * KAKAO System Planowania Wysy�ek
 * by Pawe� Pikus, Tomasz Pud�o
 */
package kakao;

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
        String sUrlString = "jdbc:sqlite:Cocoa.db";
        KakaoDb kakaoDb = new KakaoDb("org.sqlite.JDBC",sUrlString);
        
    }
    
}
