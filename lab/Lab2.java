//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Lab2.java
// Description: Prints out my name and finds the average of four ints.
// Date: 09/01/2021
//***************************************************************

import java.util.Scanner;

public class Lab2
{
	public static void main (String [] args)
	{
		//********************************
		//Part 1: Declaring variables
		//********************************
		
		int age;
		int n1, n2, n3, n4;
		double avg;

		String firstName;
		String lastName;
		String fullName;
		
		//********************************
		//Part 2: Assign values to variables
		//********************************
		
		age = 27;
		firstName = "Jose";
		lastName = "Solis";

		System.out.println(firstName + " is " + age + " years old.");

		fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		//********************************
		//Part 3: Using Mathematical Operators
		//********************************

		System.out.println("Input integer value for n1,n2,n3,n4");	
		Scanner input = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		n4 = input.nextInt();

		System.out.println("The Value of n1 is:" + n1);
		System.out.println("The Value of n2 is:" + n2);
		System.out.println("The Value of n3 is:" + n3);
		System.out.println("The Value of n4 is:" + n4);

		avg = (double) (n1 + n2 + n3 + n4) / 4;
		System.out.println("The average of n1, n2, n3 and n4 is :" + avg);

		input.close();
	}
}
