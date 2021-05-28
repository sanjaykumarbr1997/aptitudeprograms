package com.xworkz.aptitask;
import java.util.Scanner;

public class Factorial {
	
	
	void printFactorial(int number) {
		int answer=1;
		for(int i=number;i>0;i--) {
			answer= answer*i;
		}
		System.out.println("Factorial of "+number +" is : "+answer);
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find factorial of it");
		int number= scanner.nextInt();
		Factorial factorial = new Factorial();
		
		factorial.printFactorial(number);
		
		
		scanner.close();

	}

}
