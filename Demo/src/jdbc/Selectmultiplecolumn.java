package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Selectmultiplecolumn {
	public static void main(String[] args) {
		Connection conn;
		  Statement stmt;
		  ResultSet rs;
		  //int result;
		  try {
		  Class.forName("oracle.jdbc.OracleDriver");
		   conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl1234"); //url=(//localhost//port no//sidname//)username//password
		   stmt = conn.createStatement(); 
		   rs = stmt.executeQuery("select roll_no,name from student"); 
		   
		
		   while (rs.next()) {
	       System.out.println(rs.getInt(1)+" "+rs.getString(2));
	       }
		   conn.close();
		  } catch (SQLException e) {
		   e.printStackTrace();
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
}
}

