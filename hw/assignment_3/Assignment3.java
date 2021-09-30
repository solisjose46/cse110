//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Assignment3.java
// Description: Read a list of A, B, C letters, and display the histogram and GPA in a specific format.
// Date: 10/01/21
//***************************************************************

import java.util.Scanner;

public class Assignment2
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
		Scanner in = new Scanner(System.in);
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;

		do{
			System.out.println("Choose (A: add grades), (N: new grades), or (Q: quit)");
			command = in.next.toUpperCase().charAt(0);
			if(command == 'A'){
				System.out.println("Type the additional input in single line");
				while(input.hasNext()){
					if(input.next().toUpperCase.charAt(0) == 'A'){
						aCount++;
					}
					else if(input.next().toUpperCase.charAt(0) == 'B'){
						bCount++;
					}
					else if(input.next().toUpperCase.charAt(0) == 'C'){
						cCount++;
					}
				}
			}
			else if(command == 'N'){
				System.out.println("Type a new list of input in single line");
			}
			else if(command == 'Q'){
				System.out.println("*** End of program ***");
			}
			else{
				System.out.println("Invalid command was input!");
			}
		}while(command != 'Q');
	}
}
