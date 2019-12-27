package demo;

import java.util.Scanner;

public class Identifier {
	public static void main(String args[]) {
		String s;
		String Error1="Not Starting with an alphapet";
		String Error2="Contains Special Characters";
		String result="No Error";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your variable name");
		s=sc.next();
	char c=s.charAt(0);
	int ascii = (int)c;
	int count1=0;
	int count2=0;
	if(ascii>=97 && ascii<=122 || ascii>=65 && ascii<=90) {
		
	}
	else {
		count1++;
	}
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>=32 && s.charAt(i)<=47) {
			count2++;
		}
	}
	if(count1 ==0 && count2==0) {
		System.out.println("No Error");
	}
	if(count1>0 && count2>0) {
		System.out.println("Error1" +" "+ Error1);
		System.out.println("Error2"+" "+ Error2);
	}
	if(count1>0) {
		System.out.println("Error1"+" "+ Error1);
	}
	if(count2>0) {
		System.out.println("Error2"+" "+ Error2);
	}
	}

}
