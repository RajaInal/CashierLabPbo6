
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_connector {
    
    public static Connection mycon() {
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Labpbo_6", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
        return con;
    }
    
}
