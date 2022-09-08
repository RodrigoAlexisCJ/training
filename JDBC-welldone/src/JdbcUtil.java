import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtil {
	private static Connection conn;
	
	public static Connection getConnection() {
		try(FileInputStream fis = new FileInputStream("User.properties")){
			if(conn==null || conn.isClosed()) {
				Properties prop = new Properties();
				prop.load(fis);
				String url = (String) prop.get("url");
				String usr = (String) prop.get("usr");
				String pass = (String) prop.get("pass");
				conn = DriverManager.getConnection(url,usr,pass);
			}
			return conn;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}
