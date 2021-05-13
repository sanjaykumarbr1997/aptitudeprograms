package com.xworkz.aptitask;

import java.util.Scanner;

public class TriangleUpDownEvenNumber {
	void displayTriangle(int row) {
		int m=2;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row;j++) {
				
				if(((i+j)<=row +1)&&(i<=j) || ((j<=i)&& i+j>row)){
					
					if(m<=8) {
						System.out.print(" "+m+" ");
						m=m+2;
					}
					else {
						System.out.print(m+" ");
						m=m+2;
					}
					
					
				
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
		
		TriangleUpDownEvenNumber tud = new TriangleUpDownEvenNumber();
		tud.displayTriangle(row);
		
		
		
		sc.close();
	}

	


}
