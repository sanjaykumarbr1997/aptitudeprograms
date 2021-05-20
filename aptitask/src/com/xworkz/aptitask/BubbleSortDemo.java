package com.xworkz.aptitask;

public class BubbleSortDemo {

public static void main(String[] args) {
		
		int arr [] = {5,3,8,23,6,1,243,47,5,9,6};
		
		System.out.println("Before sorting");
		for(int nu :arr) {
			System.out.print(nu+" ");
		}
		System.out.println();
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				} 
				
			}
			
		}
		
		System.out.println("After sorting");
		for(int n :arr) {
			System.out.print(n+" ");
		}
		
		
	}



}
