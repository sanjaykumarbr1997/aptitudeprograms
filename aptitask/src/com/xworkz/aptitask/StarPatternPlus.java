package com.xworkz.aptitask;

public class StarPatternPlus {

	public static void main(String[] args) {
		
		int row = 7;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row;j++) {
				
				if((i==(row/2)+1)|| (j==(row/2)+1)) {
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