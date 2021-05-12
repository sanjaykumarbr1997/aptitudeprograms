package com.xworkz.aptitask;

import java.util.Scanner;

public class LeftRightAngleTriangle {
	
	
	void displayTriangle(int row) {
		

		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j<=i) {
				System.out.print("*");
				}
			}
			System.out.println();
		}	
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter number of rows");

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		LeftRightAngleTriangle lt = new LeftRightAngleTriangle();
		lt.displayTriangle(row);
	
		
		sc.close();	

	}

}
