//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Assignment3.java
// Description: Read a list of A, B, C letters, and display the histogram and GPA in a specific format.
// Date: 10/01/21
//***************************************************************

import java.util.Scanner;

public class Assignment3
{
	public static void main (String [] args)
	{
		//***************
		// Part 1
		//****************
		//
		// a) a key = Input 0s and 1s in one line
		// r key = The data is refreshed
		// b key = Invalid command, try again
		// d key = Display the result
		// q key = *** End of Program ***
		//
		// b)
//			else if(command == 'D'){
//				System.out.println("Display the result");
//
//			}

		// c) The num0 is 3 the num1 is 4
		// d)
//			System.out.printf("\n%4s|", "Num0");
//			for(int i = 0; i < num0; i++){
//				System.out.print("*");
//			}
//			System.out.printf("\n%4s|", "Num1");
//			for(int i = 0; i < num1; i++){
//				System.out.print("*");
//			}
//			System.out.println();
		// e)
//				System.out.println("The data is refreshed");
//				num0 = 0;
//				num1 = 0;
//
		//***************
		// Part 2
		//****************
		
		char command;
		Scanner input = new Scanner(System.in);
		
		//thse will help count grades entered
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		
		//since the values of the grade type doesnt need to change then set as constants
		final int A_VALUE = 4;
		final int B_VALUE = 3;
		final int C_VALUE = 2;

		//initialize gpa to zero
		double gpa = 0;

		do{
			//get users command
			System.out.println("Choose (A: add grades), (N: new grades), or (Q: quit)");
			command = input.next().toUpperCase().charAt(0);
			if(command == 'A' || command == 'N'){
				if(command == 'A'){
					System.out.println("Type the additional input in single line");			
				}
				else{
					System.out.println("Type a new list of input in single line");
					//reset the grade count
					aCount = 0;
					bCount = 0;
					cCount = 0;
				}

				//grab the line user inputs to calculate gpa
				if(input.hasNextLine()){
					//skip \n
					input.nextLine();
					//this gets the next line of characters
					String grades = input.nextLine();
					grades = grades.toUpperCase();
					
					//process each grade
					for(int i = 0; i < grades.length(); i++){
						char grade = grades.charAt(i);
						if(grade == 'A'){
							aCount++;
						}
						else if(grade == 'B'){
							bCount++;
						}
						else if(grade == 'C'){
							cCount++;
						}
					}
				}

				//calculate gpa
				gpa = (double) ((A_VALUE * aCount) + (B_VALUE * bCount) + (C_VALUE * cCount)) / (aCount + bCount + cCount);
				
				//then print the grades *
				System.out.println("----------------------");
				System.out.print("\tA|");
				for(int i = 0; i < aCount; i++){
					System.out.print("*");
				}
				System.out.println();
				System.out.print("\tB|");
				for(int i = 0; i < bCount; i++){
					System.out.print("*");
				}
				System.out.println();
				System.out.print("\tC|");
				for(int i = 0; i < cCount; i++){
					System.out.print("*");
				}
				System.out.println();
				System.out.println("----------------------");
				//formats double to two decimal places
				System.out.println("GPA: = " + String.format("%.2f",gpa));

			}
			else if(command == 'Q'){
				System.out.println("*** End of program ***");
			}
			else{
				System.out.println("Invalid command was input!");
			}
			System.out.println();
		}while(command != 'Q');
		//dont forget to close the scanner
		input.close();
	}
}
