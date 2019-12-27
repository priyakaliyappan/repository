package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatement {
public static void main(String args[])
{
	Connection conn;
	 
	  try {
	  Class.forName("oracle.jdbc.OracleDriver");
	   conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl1234"); //url=(//localhost//port no//sidname//)username//password
	   PreparedStatement pst = conn.prepareStatement("select * from student"); //driverr 4 is the thin driver
	   //rs = stmt.executeQuery("select * from STUDENT");
	   //pst.setInt(1,21);
	   //pst.setString(2,"User21");
	   //pst.setInt(3,21);
	   //execute query
	   boolean result=pst.execute();//already creating record so no need for another else part
	   //conn.commit();
	   if (result)
	   {
		   ResultSet rs =pst.executeQuery();
		   while(rs.next())
		   {
			   System.out.println(rs.getInt(1)+" "+rs.getString(2));
		   }
	   }// else part not required 
	   else
	   {
//		   int result=pst.executeUpdate();
//		   System.out.println("Number of records updated"+result);
		   conn.commit();
	   }
	   //process result
	   System.out.println(result);//true/false
//	   while (rs.next()) {
//	    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getLong(7));
//	   }
//	   conn.close();
	  } catch (SQLException e) {
	   e.printStackTrace();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
}
}
