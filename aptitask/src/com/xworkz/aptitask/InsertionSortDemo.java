package com.xworkz.aptitask;

public class InsertionSortDemo {
	
public static void main(String[] args) {
		
		int ar1[] = {7,6,3,24,5,224,4};
		System.out.println("Before sorting");
		
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		
		
		for(int l=0;l<ar1.length;l++) {
		
			int index=l;
			for(int j=l+1;j<ar1.length;j++) {
				if(ar1[j]<ar1[index]) {
					index=j;	
				}
				
				
				
			}
			
			int smallest = ar1[index];
			ar1[index]= ar1[l];
			ar1[l]=smallest;
				
			
			}
		System.out.println("After sorting");
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
			
			
	}


}
