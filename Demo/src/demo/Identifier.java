package demo;

import java.util.Scanner;

public class Identifier {
	public static void main(String args[]) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your variable name");
		s=sc.next();
	char c=s.charAt(0);
	int ascii = (int)c;
	System.out.println(c);
	System.out.println(ascii);
	}

}
