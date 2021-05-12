package com.xworkz.aptitask;

import java.util.Scanner;

public class TriangleDown {
	
	void displayTriangle(int row) {
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row;j++) {
				
				if(((i+j)<=row +1)&&(i<=j)) {
				System.out.print(i+""+j+" ");
				}
				else {
					System.out.print("  "+" ");
				}
			}
			
			System.out.println();
			
		
	}
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("Enter number of rows");
		System.out.println("Note: No of rows should be odd number and greater than 2");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		TriangleDown rt = new TriangleDown();
		rt.displayTriangle(row);
		
		
		
		sc.close();
	}

}
