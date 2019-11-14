package demo;

import java.util.Scanner;

public class Cricket {
	public static void main(String args[]) {
 int runs;
 int fours;
 int sixes;
 int result;
 double out;
 double outresult;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter runs");
 
 runs=sc.nextInt();
 System.out.println("enter fours");
 fours=sc.nextInt();
 
 System.out.println("enter sixes");
 sixes=sc.nextInt();
 result=4*fours+6*sixes;
 out=runs-result;
 System.out.println(out);
 System.out.println(runs);
 outresult=Math.abs(out*100)/110;
 System.out.format("%.2f",outresult );
 
}
}