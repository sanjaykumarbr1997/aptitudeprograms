package com.xworkz.aptitask;
import java.util.Scanner;
public class LinearSearchDemo {
	
	
	
	void search(int arr[],int number) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==number) {
				count++;
			}
		}
			
			if(count>0) {
				System.out.println("Element found");
			}
			else {
				System.out.println("Element not found");
			}
			
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Please enter the size of the array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		System.out.println("Enter "+size+" numbers into array" );
		
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scanner.nextInt();
			
		}
		
		System.out.println("Please enter the element you need to find");
		int number = scanner.nextInt();
		
		LinearSearchDemo lsd = new LinearSearchDemo();
		
		lsd.search(arr, number);
		
		scanner.close();
		
		
		

	}

}
