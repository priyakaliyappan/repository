package demo;

import java.util.Scanner;

import java.util.*;

public class Array {
public static void main(String args[]) {
	int size;
	int result=-1;
	int temp=0;
	Scanner sc=new Scanner(System.in);
	 System.out.println("enter arraysize");
	size=sc.nextInt();
    Integer arr[]=new Integer[size];
    System.out.println("enter array");
    for(int i=0;i<size;i++) {
    	arr[i]=sc.nextInt();
    	}
    List list= (List) Arrays.asList(arr);
    for(int i=0;i<arr.length;i++) {
    	for(int j=i+1;j<arr.length;j++) {
    		temp=arr[i]*arr[j];
    		
    		if(Arrays.asList(arr).contains(temp)&& result<temp){
    			result=temp;
    	}
    }
 
}System.out.println(result);
}
}

