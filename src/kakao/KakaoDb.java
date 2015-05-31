/*
 * KAKAO System Planowania Wysy�ek
 * by Pawe� Pikus, Tomasz Pud�o
 */
package kakao;

/**
 *
 * example of concrete class extending Sqlite abstract class 
 * (does nothing but connecting to Coca.db) 
 */
public class KakaoDb extends Sqlite {
    
    

public KakaoDb (String sDriverKey, String sUrlKey) throws Exception
{
        
    init(sDriverKey, sUrlKey);
        
    if (conn!= null)
    {
        System.out.println("Connected OK using " + sDriverKey+" to " +sUrlKey);
    }
    else 
    {
        System.out.println("Connection failed");
    }
}
}
    

