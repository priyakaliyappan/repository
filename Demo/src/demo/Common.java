package demo;

import java.util.Scanner;

public class Common {


	static final int M = 4;
	static final int N = 5; 

	
	static int findCommon(int mat[][]) 
	{ 
		
		int column[] = new int[M]; 

		
		int min_row; 

		
		int i; 
		for (i = 0; i < M; i++) 
			column[i] = N - 1; 

		
		min_row = 0; 

		 
		while (column[min_row] >= 0) { 
			
			for (i = 0; i < M; i++) { 
				if (mat[i][column[i]] < mat[min_row][column[min_row]]) 
					min_row = i; 
			} 

			
			int eq_count = 0; 

			
			for (i = 0; i < M; i++) { 
				
				if (mat[i][column[i]] > mat[min_row][column[min_row]]) { 
					if (column[i] == 0) 
						return -1; 

					
					column[i] -= 1; 
				} 
				else
					eq_count++; 
			} 

			
			if (eq_count == M) 
				return mat[min_row][column[min_row]]; 
		} 
		return -1; 
	} 

	
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number Of Matrix Rows");
        
        int matrixRow = sc.nextInt();
         
        System.out.println("Enter The Number Of Matrix Columns");
         
        int matrixCol = sc.nextInt();
        int[][] mat = new int[matrixRow][matrixCol];

		

		for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
            	mat[i][j] = sc.nextInt();
            }
             
            System.out.println();
        }

		int result = findCommon(mat); 
		if (result == -1) 
			System.out.print("No common element"); 
		else
			System.out.print("Common element is " + result); 
	} 
} 


