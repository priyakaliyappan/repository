package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;
public class Dynamicinsert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Connection conn;
	  Statement stmt;
	  //ResultSet rs;
	  try {
	  Class.forName("oracle.jdbc.OracleDriver");
	   conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl1234"); //url=(//localhost//port no//sidname//)username//password
	   stmt = conn.createStatement();
	   while(true)
	   {
	   System.out.println("enter rollno");
	   int roll_no=sc.nextInt();
	   System.out.println("enter name");
	   String name=sc.next();
	   System.out.println("enter age");
	   int age=sc.nextInt();
	   System.out.println("enter location");
	   String location=sc.next();
	   System.out.println("enter std");
	   int std=sc.nextInt();
	   System.out.println("enter loc");
	   String loc=sc.next();
	   System.out.println("enter salary");
	   int salary=sc.nextInt();
	   String sq=String.format("insert into student values(%d,'%s',%d,'%s',%d,'%s',%d)",roll_no,name,age,location,std,loc,salary);//the format specifier must be in single quotes for string values
	   //insert record
	   boolean result=stmt.execute(sq);
	   conn.commit();
	   System.out.println("Inserted  records successfully");
	   System.out.print("Do u want to continue(yes/no");
	  while(sc.next().equalsIgnoreCase("no"))
	  {
		  sc.close();
		  break;
	  }
	   }
	  } 
	   catch (SQLException e) {
	   e.printStackTrace();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
}
}