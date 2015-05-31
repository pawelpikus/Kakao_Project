/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
