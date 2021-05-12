package com.xworkz.aptitask;

import java.util.Scanner;

public class TriangleLeftPlusRight {
	
	void displayTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if((i+j<=row+1 && i>=j)||(i+j>=row+1 && j>=i))
					System.out.print(i+""+j+" ");
				else
					System.out.print("  "+" ");
			}
			System.out.println();
		}
		
	}
	
		public static void main(String[] args) {
			System.out.println("Enter number of rows");
			System.out.println("Note: No of rows should be odd row and greater than 2");
			
			Scanner sc  = new Scanner(System.in);
			int row = sc.nextInt();
			
			TriangleLeftPlusRight  ra = new TriangleLeftPlusRight ();
			ra.displayTriangle(row);
			
			sc.close();

		}

}
