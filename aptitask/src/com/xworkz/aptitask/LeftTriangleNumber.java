package com.xworkz.aptitask;

import java.util.Scanner;

public class LeftTriangleNumber {
	void displayTriangle(int row) {
		

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j<=i) {
				System.out.print(j+" ");
				}
			}
			System.out.println();
		}	
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter number of rows");

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		LeftTriangleNumber la = new LeftTriangleNumber();
		la.displayTriangle(row);
	
		
		sc.close();	

	}

}
