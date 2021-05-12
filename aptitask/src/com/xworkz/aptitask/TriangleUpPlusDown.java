package com.xworkz.aptitask;

import java.util.Scanner;

public class TriangleUpPlusDown {
	void displayTriangle(int row) {
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row;j++) {
				
				if(((i+j)<=row +1)&&(i<=j) || ((j<=i)&& i+j>row)){
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
		
		TriangleUpPlusDown rv = new TriangleUpPlusDown();
		rv.displayTriangle(row);
		
		
		
		sc.close();
	}

	

}
