package com.xworkz.aptitask;
import java.util.Scanner;


public class PrimeNumberDemo {
	void primeFinder(int number) {
		
		if(number>2  && number%2 !=0 && number%3!=0 || number==2||number==3 ) {
			System.out.println(number +" " +"is a prime number");
			
		}
		else {
			System.out.println(number +" "+"is not a prime number");
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to prime number checker");
		System.out.println("Please enter a number");
		
		Scanner scanner = new Scanner(System.in);
		int number =scanner.nextInt();
		PrimeNumberDemo pnd = new PrimeNumberDemo();
		pnd.primeFinder(number);
		scanner.close();
	}

}
