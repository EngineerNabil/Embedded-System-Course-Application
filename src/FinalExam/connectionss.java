
package FinalExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver;


public class connectionss {

    public static void main(String[] args) {
    
       try{
           System.out.println(6/0);
       }catch(ArithmeticException e){
           System.out.println("divided by zero");
       }finally{
           System.out.println("End of the program");
       } 
        
        
    }
    
    
   public static Connection connect() throws SQLException{
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="micaAcad2";
        String password="mica";
        DriverManager.registerDriver(new OracleDriver());
        Connection c = DriverManager.getConnection(url, user, password);
        return c;    
       
    
   }   
    
    
    
}

