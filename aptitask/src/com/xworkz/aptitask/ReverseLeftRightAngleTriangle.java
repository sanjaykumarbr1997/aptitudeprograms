package com.xworkz.aptitask;
import java.util.*;

public class ReverseLeftRightAngleTriangle{
	

	public static void main(String[] args) {
		
		System.out.println("Enter number of rows");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=row;i>0;i--) {
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		
	}
		sc.close();
	}

}
