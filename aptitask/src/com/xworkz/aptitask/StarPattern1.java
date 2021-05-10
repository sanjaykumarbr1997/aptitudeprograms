package com.xworkz.aptitask;

public class StarPattern1 {

	public static void main(String[] args) {
		
		int number = 4;
		
		for(int i=1;i<=number;i++) {
			
			for(int j= 1;j<=number;j++) {
				
				
				if(((i==2)||(i==3))&&((i==j)||(i+j==5))) {
					System.out.print("  "+" ");
	
				}
				else {
				System.out.print(i+""+j+" ");
				}
			}
			System.out.println();

		}

	}

}
