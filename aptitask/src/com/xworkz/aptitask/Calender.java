package com.xworkz.aptitask;

public class Calender {
	
	
	public static void main(String[] args) {
		
		// for loop
		
		for(int i=1;i<=31;i++) {
			
			if(i>=1 && i<=7) {
				System.out.print(" "+i+" ");
				if(i==7) {
					System.out.println();
				}
				
			}
			else if(i>=8 && i<=14){
				
				if(i>=8 && i<=9) {
					System.out.print(" "+i+" ");

				}
				else {
					System.out.print(i+" ");
				}
				
				
				
				if(i==14) {
					System.out.println();
				}
			}
			
			else if(i>=15 && i<=21 ) {
				System.out.print(i+" ");
				if(i==21) {
					System.out.println();
				}
			}
			
			else if(i>=22 && i<=28 ) {
				System.out.print(i+" ");
				if(i==28) {
					System.out.println();
				}

			}
			
			else {
				System.out.print(i+" ");
			}
			
			
			
		}
		
		
		//While loop
		System.out.println();
		System.out.println("-------------------");
		int j=1;
		while(j<=31) {

			if(j>=1 && j<=7) {
				System.out.print(" "+j+" ");
				if(j==7) {
					System.out.println();
				}
				
			}
			else if(j>=8 && j<=14){
				
				if(j>=8 && j<=9) {
					System.out.print(" "+j+" ");

				}
				else {
					System.out.print(j+" ");
				}
				
				
				
				if(j==14) {
					System.out.println();
				}
			}
			
			else if(j>=15 && j<=21 ) {
				System.out.print(j+" ");
				if(j==21) {
					System.out.println();
				}
			}
			
			else if(j>=22 && j<=28 ) {
				System.out.print(j+" ");
				if(j==28) {
					System.out.println();
				}

			}
			
			else {
				System.out.print(j+" ");
			}
			
			j++;
			
		}
		
		//do while
		System.out.println();
		System.out.println("-------------------");
		int k=1;
		do {

			if(k>=1 && k<=7) {
				System.out.print(" "+k+" ");
				if(k==7) {
					System.out.println();
				}
				
			}
			else if(k>=8 && k<=14){
				
				if(k>=8 && k<=9) {
					System.out.print(" "+k+" ");
				}
				else {
					System.out.print(k+" ");
				}
				
				
				
				if(k==14) {
					System.out.println();
				}
			}
			
			else if(k>=15 && k<=21 ) {
				System.out.print(k+" ");
				if(k==21) {
					System.out.println();
				}
			}
			
			else if(k>=22 && k<=28 ) {
				System.out.print(k+" ");
				if(k==28) {
					System.out.println();
				}

			}
			
			else {
				System.out.print(k+" ");
			}
			
			k++;
			
		}while(k<=31);

		
		
		
		
		
	}

}
