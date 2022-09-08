import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.List;
import java.sql.SQLException;

public class EmployeeDAO {
	private static final String QUERY="SELECT * FROM employees_tb";
	public static void showAll(){
		PreparedStatement pstm = null;
		ResultSet rs= null;
		try{
			Connection conn = JdbcUtil.getConnection();
			pstm = conn.prepareStatement(QUERY);
			rs = pstm.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setDept(rs.getString("dept"));
				emp.setSalary(rs.getInt("salary"));
				System.out.println(emp);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
