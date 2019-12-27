package jdbc;

import java.sql.*;
import java.util.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import javax.sql.*;
public class Basic {

 public static void main(String args[]) {
  Connection conn;
  Statement stmt;
  ResultSet rs;
  try {
  Class.forName("oracle.jdbc.OracleDriver");
   conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl1234"); //url=(//localhost//port no//sidname//)username//password
   stmt = conn.createStatement(); //driverr 4 is the thin driver
   rs = stmt.executeQuery("select * from STUDENT");
   
   
   while (rs.next()) {
    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getLong(7));
   }
   conn.close();
  } catch (SQLException e) {
   e.printStackTrace();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
}



/*package Demo;

import java.sql.*;
import java.util.Scanner; 
public class Testing{ 

public static void main(String args[]){ 

try{ 
 
Class.forName("oracle.jdbc.driver.OracleDriver"); 

 
Connection con=DriverManager.getConnection( 
"jdbc:oracle:thin:@localhost:1521:orcl","system","developer");//system== db user name;developer==your db password 


Statement stmt=con.createStatement(); 
Scanner sc=new Scanner(System.in);
ResultSet result;
result=stmt.executeQuery("select * from customer order by id asc"); //customer==your table name
while(result.next()) {
	
	System.out.println(result.getInt(1)+" "+result.getString(2));//table values
}

//p.close();
con.close(); 

}catch(Exception e){ System.out.println(e);} 

} 
}*/