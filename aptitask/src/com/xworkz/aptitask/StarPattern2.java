package com.xworkz.aptitask;

public class StarPattern2 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row;j++) {
				
				if((i==3)|| (j==3)) {
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
