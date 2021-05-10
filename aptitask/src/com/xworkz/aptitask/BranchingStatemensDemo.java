package com.xworkz.aptitask;

public class BranchingStatemensDemo {

	public static void main(String[] args) {
		
		for (int i=2; i<51; i++) {
			if(i%2!=0) {
				continue ;
			}
			else {
				System.out.print(i+" ");
			}
			System.out.println("hello");
		}

	}

}
