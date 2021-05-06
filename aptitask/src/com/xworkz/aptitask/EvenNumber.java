package com.xworkz.aptitask;

public class EvenNumber {

	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++) {
			if(i%2==0) {
			System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//while loop
		int j= 2;
		while(j<=100) {
			if (j%2==0) {
			System.out.print(j+" ");
			}
			j++;
		}
		
		System.out.println();
		//do while loop
		int k=2;
		do {
			if (k%2 ==0) {
			System.out.print(k+" ");
			}
			k++;
		}while(k<=100);
			

	}

}
