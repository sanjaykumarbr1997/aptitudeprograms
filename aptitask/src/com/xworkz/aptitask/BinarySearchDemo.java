package com.xworkz.aptitask;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchDemo {
	
	
	
	
	void search(int []arr,int number) {
		Arrays.sort(arr);
		int lower =0;
		int upper = arr.length;
		int mid =0;
		
		while(lower<upper) {
			mid = (lower+upper)/2;
			
			if(arr[mid]==number) {
				System.out.println("Number "+arr[mid]+" found" );
				break;
			}
			else if(number<arr[mid]) {
				upper=mid;
				
			}
			else if(number>arr[mid]) {
				lower=mid;
			}
			
		}
			
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size of the element you need to enter");
		int size = scanner.nextInt();
		
		int arr[]= new int[size];
		
		System.out.println("Enter "+size+" elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the number you need to find ");
		int number = scanner.nextInt();
		
		BinarySearchDemo bsd = new BinarySearchDemo();
		bsd.search(arr,number);
		
		
		scanner.close();
		
		
		
	}

}
