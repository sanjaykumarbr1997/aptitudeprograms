package com.xworkz.aptitask;

import java.util.Scanner;



public class RightPointingTriangleNumber {
	
	void displayTriangle(int row) {
		int k=1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if(i+j<=row+1 && i>=j) {
					if(k<=9) {
					System.out.print(" "+k+" ");
				    k=k+2;
					}
					else {
						System.out.print(k+" ");
					    k=k+2;
					}
				}
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
			
			
			RightPointingTriangleNumber  ra = new RightPointingTriangleNumber ();
			ra.displayTriangle(row);
			sc.close();

			

			
		}


}
