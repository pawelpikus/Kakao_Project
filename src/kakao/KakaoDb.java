/*
 * KAKAO System Planowania Wysy�ek
 * by Pawe� Pikus, Tomasz Pud�o
 */
package kakao;

/**
 *
 * @author Lusiotron2015
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
    

