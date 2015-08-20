/*
 * KAKAO System Planowania Wysylek
 * by Pawel Pikus, Tomasz Pudlo
 */
package kakao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * abstract class to connect to any DB 
 */
abstract class Sqlite {
    public String sDriver ="";
    public String sUrl = null;
    public int iTimeout = 30;
    public static Connection conn = null;
    public Statement statement =null;
    
    public Sqlite ()
    {}
    
    public Sqlite(String sDriverToLoad, String sUrlToLoad) throws Exception
    {
        init(sDriverToLoad, sUrlToLoad);
    }
    
    public void init(String sDriverVar, String sUrlVar) throws Exception
    {
        setDriver(sDriverVar);
        setUrl(sUrlVar);
        setConnection();
        setStatement();
    }
    
    private void setDriver (String sDriverVar)
    {
        sDriver=sDriverVar;
        
    }
    private void setUrl(String sUrlVar)
        {
            sUrl=sUrlVar;
            
        }
    public void setConnection () throws Exception{
        Class.forName(sDriver);
        conn = DriverManager.getConnection(sUrl);
    }
    
    public Connection getConnection()
    {
        return conn;
    }
    
    public void setStatement () throws Exception
    {
        if (conn == null){
            setConnection();
        }
        
        statement = conn.createStatement();
        statement.setQueryTimeout(iTimeout);
        
    }
    
    public Statement getStatement(){
        return statement;
    }
    
    public void executeStmt(String instruction) throws SQLException{
        statement.executeUpdate(instruction);
    }
    // processes an array of instructions e.g. a set of SQL command strings passed from a file
    //NB you should ensure you either handle empty lines in files by either removing them or parsing them out 
    // since they will generate spurious SQLExceptions when they are encountered during the iteration....
    
    public void executeStmt (String[] instructionSet) throws SQLException{
        for (String instructionSet1 : instructionSet) {
            executeStmt(instructionSet1);
        }
        
    }
    
    public ResultSet executeQry(String instruction) throws SQLException{
        return statement.executeQuery(instruction);
    }
    
    public void closeConnection(){
        try {conn.close();} catch (Exception ignore){}
        
    }
                
    
}

