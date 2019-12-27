package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatesinglerow {
public static void main(String args[])
{
	Connection conn;
	  Statement stmt;
	  //ResultSet rs;
	  int result;
	  try {
	  Class.forName("oracle.jdbc.OracleDriver");
	   conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl1234"); //url=(//localhost//port no//sidname//)username//password
	   stmt = conn.createStatement(); //driverr 4 is the thin driver
	   //result = stmt.executeUpdate("update student set loc='egmore123' where roll_no=76");
	   result = stmt.executeUpdate("update student set loc='chennaiOne' where loc='Chennai'");//we are using executeUpdate here which will return true or false value hence the variable used for string that must be of type int not resultset
	   System.out.print(result);
	  // while (rs.next()) {
      //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getLong(7));   System.out.println(
     // }
	   conn.close();
	  } catch (SQLException e) {
	   e.printStackTrace();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
}
}
