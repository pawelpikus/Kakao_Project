/*
 * KAKAO System Planowania Wysylek
 * by Pawel Pikus, Tomasz Pudlo
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
        //String sUrlString = "jdbc:sqlite:Cocoa.db";
        //KakaoDb kakaoDb = new KakaoDb("org.sqlite.JDBC",sUrlString);
        ReadCSV obj = new ReadCSV();
	obj.run();
              
    }       
}
