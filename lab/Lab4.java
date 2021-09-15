//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Lab4
// Description: This program is for practicing the switch statement, do-while,while and for loops.
// Date: 09/15/2021
//***************************************************************

import java.util.Scanner;

public class Lab4
{
	public static void main (String [] args)
	{
		//lab4 constants
		final int SUM = 1;
		final int FACTORIAL = 2;
		final int FACTORS = 3;
		final int QUIT = 4;

		int choice;

		Scanner input = new Scanner(System.in);

		do{
			System.out.println("\nThis program does the following:");
			System.out.println(" 1. Sum of numbers from 1 to n");
			System.out.println(" 2. Factorial of n");
			System.out.println(" 3. Factors of n");
			System.out.println(" 4. Quit");
			System.out.println("Please choose an option");

			choice = input.nextInt();
			int num;
			switch(choice){
				case SUM:
					System.out.print("\nPlease enter a number n: ");
					num = input.nextInt();
					int sum = 0;
					int count = 0;

					while(count < num){
						count++;
						sum+=count;
					}

					System.out.println("Sum of numbers from 1 - " + num + " is " + sum);
					
					break;
				case FACTORIAL:
					System.out.print("\nPlease enter a number n: ");
					num = input.nextInt();
					long fact = 1;

					for(int i = num; i > 1; i--){
						fact*=i;
					}

					System.out.println("Factorial of number " + num + " is " + fact);
					break;
				case FACTORS:
					System.out.print("\nPlease enter a number n: ");
					num = input.nextInt();

					System.out.println("Factors of number " + num + " are");

					for(int i = 1; i <= num; i++){
						if(num % i == 0){
							System.out.print(i + "  ");
						}
					}

					break;
				case QUIT:
					System.out.println("Your choice was <QUIT>, Quitting the program, Have a good day!");
					break;
				default:
					System.out.println("Incorrect choice, "+ choice  +" Please choose again");
					break;
			}


		}while(choice != QUIT);
	}
}
