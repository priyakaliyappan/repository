package demo;

import java.util.Scanner;

public class DiceAgain {
	public static void main(String args[]) {
 int value1;
 int value2;
 int value3;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter value1");
 
 value1=sc.nextInt();
 System.out.println("enter value2");
 value2=sc.nextInt();
 if(value1<=6 && value2<=6) {
	 
		 value3=value1+value2;
		 if(value3<8) {
			 value3=8-value3;
			 System.out.println(value3);
		
		 }
		 else {
			 value3=2*(value3-8);
			 System.out.println(value3);
				
		 }
	
	 }
 else {
	 System.out.println("enter the numbers between 0 to 6");
 }
 
}
}