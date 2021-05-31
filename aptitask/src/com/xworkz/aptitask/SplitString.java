package com.xworkz.aptitask;

public class SplitString {

	public static void main(String[] args) {
		
		String msg= "Hello Hello Hello Wakeup Developers";
		String temp="";  
		
				
		char []arr = msg.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				count++;
			}
			
		}
		System.out.println(count);
		
		String arry[]=new String[count];

		int value =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=65 && arr[i]<=122) { 
				
				temp +=arr[i];     
			}
			
			else {
				
				arry[value]=temp;
				System.out.println(temp); 
				temp="";	
				value++;
			}
			
		}
		System.out.println(temp); 
		System.out.println("----Printing String array-----");
		
		for(String s :arry) {
			System.out.print(s+" ");
		}

	}

}
