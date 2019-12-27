package jdbc;

import java.sql.*;
import java.util.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import javax.sql.*;
public class Insertingrows {
	 public static void main(String args[]) {
	  Connection conn;
	  Statement stmt;
	  ResultSet rs;
	  try {
	  Class.forName("oracle.jdbc.OracleDriver");
	   conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl1234"); //url=(//localhost//port no//sidname//)username//password
	   stmt = conn.createStatement(); //driverr 4 is the thin driver
	   rs = stmt.executeQuery("INSERT ALL  \r\n" + 
	   		"  INTO student  VALUES (76,'abc',45,'egmore',543,'tamb',6444)  \r\n" + 
	   		"  INTO student VALUES (75,'def',65,'thiruvanmyur',324,'chrom',3211)  \r\n" + 
	   		"SELECT * FROM dual");  
	   
//	   while (rs.next()) {
//	    //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getLong(7));   System.out.println(
//	   }
	   conn.close();
	  } catch (SQLException e) {
	   e.printStackTrace();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 }
	}


