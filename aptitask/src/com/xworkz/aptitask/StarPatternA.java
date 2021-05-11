package com.xworkz.aptitask;


public class StarPatternA {

	public static void main(String[] args) {
		
		int row = 6;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row;j++) {
				
				if((i==(row/2)+1)||(i==1)|| (j==1)||(j==row)) {
					System.out.print (i+""+j+" ");
				}
				else {
				
				System.out.print("  "+" ");
				} 
			}
			System.out.println();
		}
		

	}

}
