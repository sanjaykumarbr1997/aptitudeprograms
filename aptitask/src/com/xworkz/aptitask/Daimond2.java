package com.xworkz.aptitask;
import java.util.Scanner;

public class Daimond2 {
	
	void displayPattern(int row) {
		
		int middle = (row/2)+1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if((i+j==middle+1)||(j-i==middle-1)||(i+j==middle+row)||(i-j==middle-1)) {
				System.out.print("*"+" ");
			    }
			    else {
				System.out.print(" "+" ");
			    }
			
			}
			System.out.println();

			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		System.out.println("Note: Number should be odd greater than 2");
		
		int row = scanner.nextInt();		
		Daimond2 d2 = new Daimond2();
		
		d2.displayPattern(row);
		
		scanner.close();
			
	}
 		

}
