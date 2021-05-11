package com.xworkz.aptitask;

public class StarPatternSquare {

public static void main(String[] args) {
		
		int row = 7;
		
		for(int i=1;i<=row;i++) {
			
			for(int j= 1;j<=row;j++) {
				
				
				if((i==1)||(i==row)||(j==1)||(j==row)) {
					System.out.print(i+""+j+" ");
	
				}
				else {
				System.out.print("  "+" ");
				}
			}
			System.out.println();

		}

	}
}
