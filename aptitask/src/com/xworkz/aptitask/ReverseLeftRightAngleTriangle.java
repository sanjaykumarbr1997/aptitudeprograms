package com.xworkz.aptitask;
import java.util.*;

public class ReverseLeftRightAngleTriangle{
	
	
	void displayTriangle(int row) {
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row;j++) {
				
				if((i+j)<=row +1) {
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
		
		ReverseLeftRightAngleTriangle rat = new ReverseLeftRightAngleTriangle();
		rat.displayTriangle(row);
		
		
		
		sc.close();
	}

}
