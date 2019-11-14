package demo;

import java.util.Scanner;

public class Arithmetic {
	public void operation(int a,int b,int c) {
		int flag=0;
		if(c == a+b) {
			flag++;
			System.out.println("Add");
			
		}
		if(c == a-b) {
			flag++;
			System.out.println("subtract");
			
			
		}
		if(c == a*b) {
			flag++;
			System.out.println("Multiply");
			
			
		}
		if(c == a/b) {
			flag++;
			System.out.println("Divide");
		
			
		}
		if(c == a%b) {
			flag++;
			System.out.println("Modulo");
		
			
		}
		if(flag ==0) {
			System.out.println("not possible");
		}
	}
	public static void main(String args[]) {
		int a,b;
		int c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your value of a");
		a=sc.nextInt();
		System.out.println("enter your value of b");
		b=sc.nextInt();
		System.out.println("enter your value of c");
		c=sc.nextInt();
		Arithmetic arith=new Arithmetic();
		arith.operation(a,b,c);
	
	}
}
