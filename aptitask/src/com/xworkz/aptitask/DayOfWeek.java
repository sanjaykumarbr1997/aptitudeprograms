package com.xworkz.aptitask;

public class DayOfWeek {
	
	public static void main(String []args){

		int i = 8;
		int rd = i%7;
			
		
		if(i==1||rd==1) {
			System.out.println("Sunday");
		}
		else if(i==2||rd==2) {
			System.out.println("Monday");
		}
		else if(i==3||rd==3) {
			System.out.println("Tuesday");
		}
		else if(i==4||rd==4) {
			System.out.println("Wednesday");
		}
		else if(i==5||rd==5) {
			System.out.println("Thursday");
		}
		else if(i==6||rd==6) {
			System.out.println("Friday");
		}
		else {
			System.out.println("Saturday");
		}


		       


		    }
	
	

}
