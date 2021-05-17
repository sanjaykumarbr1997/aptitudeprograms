package com.xworkz.aptitask;
import java.util.Scanner;

public class Alphabet {
	
void display(String inputValue) {
		
		int row=7;
		
				if(inputValue.equals("A")) {
				for(int i=1;i<=row;i++) {
					for(int j=1;j<=row;j++) {
						if(((j==1||j==row||i==1||i==(row/2)+1)))  {
						System.out.print("*"+" ");
						}
						else {
							System.out.print(" "+" ");
						}
					}
					System.out.println();
				}
			   }
				else if(inputValue.equals("B")) {
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							if(((j==1||j==row && i!=1 &&i!=(row/2)+1 && i!=row ||i==1 && j!=row||i==(row/2)+1 && j!=row||i==row && j!=row) )) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
				   }
				else if(inputValue.equals("C")) {
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							if(j==1 && i!=1 && i!=row ||i==1&&j!=1||i==row && j!=1) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
				   }
				else if(inputValue.equals("D")) {
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							if( (j==2||i==1 && j!=row && j!=1||i==row && j!=1 &&j!=row||j==row && i!=row && i!=1)) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
				   }
				
				else if(inputValue.equals("E")) {
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							if( (j==1||i==1||i==row)||(i==(row/2)+1)) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
				   }
				
				else if(inputValue.equals("F")) {
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							if( (j==1||i==1 ||(i==(row/2)+1 && j!=row))) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
				   }
				
				else if(inputValue.equals("G")) {
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							if( ((j==1||i==1 ||(i==(row/2)+1 && ((j!=2)) )||(i==row)) || (i>(row/2)+1 && j==row) ))  {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
				   }
				
				else if(inputValue.equals("H")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(i==(row/2)+1 || j==1 || j==row) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("I")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(j==(row/2)+1 || i==1 || i==row) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("J")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(j==(row/2)+1 && i!=row || i==1 || (i==row && (j<(row/2)+1)) && j!=1 ) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("K")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(j==1 || (i-j == (row/2)-1) ||(i+j)==(row/2)+3 ) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("L")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(j==1 || i==row ) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("M")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(j==1 || j==row ||( (i<=(row/2)+1) && (i==j)) || ((i<=(row/2)+1)  && (i+j==2*((row/2)+1)) )) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("N")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(j==1 || j==row ||  (i==j)  ) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("O")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if((j==1 && i!=1 && i!=row)|| (j==row-2 && i!=1 && i!=row )||  (i==row && j!=1 && j<row-2  ) || (i==1 && j!=1 && j<row-2  ) ) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("P")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if((j==1|| (i==1 && j<row-1 )||( i==(row/2)+1)&& j<row-1) || (i<(row/2)+1 && j==row-1 && i!=1   ) ){
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("Q")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if((j==1 && i!=1 && i!=row-1 && i!=row)|| (j==row-2 && i!=1 && i!=row-1 )||  
									(i==row-1 && j!=1 && j<row-2  ) || (i==1 && j!=1 && j<row-2  ) || (i==row-2 && j==(row/2))) {
							System.out.print("*"+" "); 
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				else if(inputValue.equals("R")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if((j==1|| (i==1 && j<row-1 )||( i==(row/2)+1)&& j<row-1) || 
									(i<(row/2)+1 && j==row-1 && i!=1 )||(i-j==1 && (i>(row/2)+1)) ){
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				else if(inputValue.equals("S")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if((i==1 && j!=1) || i== row && j!=row ||j==1 && i<(row/2)+1 && i!=1 || i ==(row/2)+1 && j!=1 && j!=row|| j==row && i>(row/2)+1 && i!=row ) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("T")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(i==1||j==(row/2)+1) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("U")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(i==row && j!=1 &&  j!=row||j== 1 && i!=row|| j==row && i!=row) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("V")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if((i%2!=0 && i<=(row/2)+2 ) && ((i-j==1) || (i==1&&j==1) ||((j-i)%3==0 && (j-i)>0 &&(j>(row/2)+1 ))  )) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("W")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(j==1||j==row|| (i>=(row/2)+1 && (i+j==row+1 || i==j))) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("X")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(i==j || i+j==row+1) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("Y")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if((i<=(row/2)+1)&&(i==j || i+j==row+1) || (i>=(row/2)+1)&& j==(row/2)+1) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
				else if(inputValue.equals("Z")){
					for(int i=1;i<=row;i++) {
						for(int j=1;j<=row;j++) {
							
							if(i==1||i==row|| i+j==row+1) {
							System.out.print("*"+" ");
							}
							else {
								System.out.print(" "+" ");
							}
						}
						System.out.println();
					}
					
				}
				
			
		}
		
		
		public static void main(String[] args) {
			System.out.println("Enter an uppercase alphabet to print:");
			
			Scanner scanner = new Scanner(System.in);
			
			String inputValue = scanner.nextLine();
			System.out.println();
			Alphabet alphabet = new Alphabet();
			alphabet.display(inputValue);
			
			scanner.close();
			
		}	
			
}
