//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Assignment1.java
// Description: Calculators to determine number of bills for given dollar amount and how many days, hours, minutes and seconds in given time.
// Time given in seconds.
// Date: 09/07/2021
//***************************************************************

import java.util.Scanner;

public class Assignment1
{
	public static void main (String [] args)
	{
		//***************
		// Part 1
		//****************
		
		/*
		 * Question 1) To determine the amount of bills for the input number, cash, is divided by 100. This gets you the number of
		 * hundred bills. The remainder, if any, is found by taking the modulus of cash and 100.  The remainder becomes cash. 
		 * The remainder is needed to determine the next bill amount. Cash is once again divided by 20 to determine the amount
		 * of bills for twenties. Again, remainder is needed to determine the next bill amount. Cash is set equal to the remainder
		 * of Cash divided by 20. This process is repeated until the ones are reached.
		 *
		 * Question 2) The same strategy is applied from question 1 to question 2. Take time, in seconds, divided by 86400.
		 * The whole number is number of days. The remainder is use to determine hours. This process is continued until the seconds
		 * are reached.
		 */

		//***************
		// Part 2
		//****************
		
		int cash = 0;
		int remainingCash = 0;
		int hundreds = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;

		final int HUNDRED = 100;
		final int TWENTY = 20;
		final int TEN = 10;
		final int FIVE = 5;
		final int ONE = 1;
		
		System.out.println("*** Question 1 ***");
		System.out.print("Please input the total amount of money. ");
		Scanner input = new Scanner(System.in);
		
		cash = input.nextInt();

		hundreds = cash / HUNDRED;
		remainingCash = cash % HUNDRED;

		twenties = remainingCash / TWENTY;
		remainingCash = remainingCash % TWENTY;

		tens = remainingCash / TEN;
		remainingCash = remainingCash % TEN;

		fives = remainingCash / FIVE;
		remainingCash = remainingCash % FIVE;

		ones = remainingCash;

		System.out.println("\t$" + String.format("%,d", cash) + " is");
		System.out.println("\t\t$100 Bills\t" + hundreds);
		System.out.println("\t\t$20 Bills\t" + twenties);
		System.out.println("\t\t$10 Bills\t" + tens);
		System.out.println("\t\t$5 Bills\t" + fives);
		System.out.println("\t\t$1 Bills\t" + ones);

		int time = 0;
		int remainingTime = 0;
		int days = 0;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		final int SECONDS_IN_DAY = 86400;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;

		System.out.println("\n*** Question 2 ***");
		System.out.print("Please input the time in seconds. ");

		time = input.nextInt();

		days = time / SECONDS_IN_DAY;
		remainingTime = time % SECONDS_IN_DAY;

		hours = remainingTime / SECONDS_IN_HOUR;
		remainingTime = remainingTime % SECONDS_IN_HOUR;

		minutes = remainingTime / SECONDS_IN_MINUTE;
		remainingTime = remainingTime % SECONDS_IN_MINUTE;

		seconds = remainingTime;

		System.out.println("\t" + String.format("%,d", time) + " seconds are");
		System.out.println("\t\t" + days + "\tDays");
		System.out.println("\t\t" + hours + "\tHours");
		System.out.println("\t\t" + minutes + "\tMinutes");
		System.out.println("\t\t" + seconds + "\tSeconds");
		
		input.close();

		System.out.println( "**** End of Program ****");
	}
}
