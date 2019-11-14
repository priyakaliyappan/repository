package demo;

import java.util.Scanner;

public class Interest {
	public static void main(String args[]) {
		float borrow;
		int rate;
		int amount;
		float si;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter borrow");
		 borrow=sc.nextFloat();
		 System.out.println("enter rate");
		 rate=sc.nextInt();
		 System.out.println("enter amount");
		 amount=sc.nextInt();
		 si=amount-borrow;
		 n=(int) ((si*100)/(borrow*rate));
		 System.out.println(n);
	}

}
