package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Selectspecificrow {

	public static void main(String[] args) {
					Connection conn;
					  Statement stmt;
					  ResultSet rs;
					  //int result;
					  try {
					  Class.forName("oracle.jdbc.OracleDriver");
					   conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl1234"); //url=(//localhost//port no//sidname//)username//password
					   stmt = conn.createStatement(); 
					   rs = stmt.executeQuery("select name from student where roll_no=10");  //we are using executeUpdate here which will return true or false value hence the variable used for string that must be of type int not resultset
					   
					
					   while (rs.next()) {
				       System.out.println(rs.getString(1));
				       }
					   conn.close();
					  } catch (SQLException e) {
					   e.printStackTrace();
					  } catch (Exception e) {
					   e.printStackTrace();
					  }
	}

}
