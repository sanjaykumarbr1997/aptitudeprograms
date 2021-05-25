package com.xworkz.aptitask;
public class InsertionSortDemo {	
public static void main(String[] args) {
		
		int ar1[] = {7,6,3,24,5,224,4};
		System.out.println("Before sorting");
		
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		for(int i=1;i<ar1.length;i++) {
			System.out.println();
			//System.out.println("Value of i: "+i);
			int number = ar1[i];
			
			for(int j=i-1;j>-1;j--) {
				//System.out.println("Value of j:"+j);			
				if(number<ar1[j]) {
					ar1[j+1]= ar1[j];
					ar1[j]=number;
					
					for(int lp:ar1) {
						System.out.print(lp+" ");
					}
					System.out.println(); 	
				}		
			}	
		}
		System.out.println("After Sorting");
		for(int lk:ar1) {
			System.out.print(lk+" ");
		}
	}
}
