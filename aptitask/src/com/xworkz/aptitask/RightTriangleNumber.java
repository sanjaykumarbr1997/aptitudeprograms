package com.xworkz.aptitask;

import java.util.Scanner;

public class RightTriangleNumber {

	void displayTriangle(int row) {

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if((i+j>row)) {
					System.out.print(j+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of rows");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		RightTriangleNumber tr = new RightTriangleNumber();
		
		tr.displayTriangle(row);
			
			
			
			sc.close();
			
			
			

		}



}
