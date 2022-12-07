import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	    public static DBConnection DBC;
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;

	   
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    
	    public static DBConnection getDBC() throws SQLException {
	    	if(DBC == null)
	    		DBC= new DBConnection();
	    	return DBC;
	    }

	    
	    public Connection getConn() {
			return conn;
		}


		
	
}
