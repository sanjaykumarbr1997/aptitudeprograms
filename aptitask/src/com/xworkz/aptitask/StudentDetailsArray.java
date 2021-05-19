package com.xworkz.aptitask;

public class StudentDetailsArray {

	public static void main(String[] args) {
		
		String name[] = {"Arvind","Bharat","Dileep","Ravi"};
		int age[]  = new int[4]	;
		
		age[0] = 21;
		age[1] = 22;
		age[2] =23;
		age[3]= 24;
		
		System.out.println("Name and age of students");
		
		System.out.print("name:");

		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+" ");
		}
		
		System.out.println();
		System.out.print("age:");
		for(int i=0;i<name.length;i++) {
			System.out.print(age[i]+" ");
			
		}
		
		
	}

}
