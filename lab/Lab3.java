//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Lab3
// Description: This program is for practicing the use of if-else conditional expressions. 
// It also reviews some previous topics. It also finds the dictionary order of two strings.
// Date: 09/08/2021
//***************************************************************

import java.util.Scanner;

public class Lab3
{
	public static void main (String [] args)
	{
		System.out.println("Input four integers on which we want to perform Mathematical Operations!");

		double n1, n2, n3, n4, ans, max, min;
		String s1 = new String("");
		Scanner in = new Scanner(System.in);
		
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		n4 = in.nextInt();

		//find max
		if(n1 > n2){
			max = n1;
		}
		else{
			max = n2;
		}
		if(n3 > max){
			max = n3;
		}
		if(n4 > max){
			max = n4;
		}

		//find min
		if(n1 < n2){
			min = n1;
		}
		else{
			min = n2;
		}
		if(n3 < min){
			min = n3;
		}
		if(n4 < max){
			min = n4;
		}

		System.out.println("Please Input one of the following operations:");		
		System.out.println("Type a to Add the numbers.");
		System.out.println("Type b to Mul the numbers.");
		System.out.println("Type c to find Avg.");
		System.out.println("Type d to find Max.");
		System.out.println("Type e to find Min.");
		s1 = in.next();

		if(s1.equals("a")){
			ans = n1 + n2 + n3 + n4;
			System.out.println("Answer is : "+ ans);
		}
		else if (s1.equals("b")){
			ans = n1 * n2 * n3 * n4;
			System.out.println("Answer is : "+ ans);
		}
		else if (s1.equals("c")){
			ans = (n1 + n2 + n3 + n4) / 4;
			System.out.println("Answer is : "+ ans);
		}
		else if (s1.equals("d")){
			ans = max;
			System.out.println("Answer is : "+ ans);
		}
		else if (s1.equals("e")){
			ans = min;
			System.out.println("Answer is : "+ ans);
		}
		else{
			System.out.println("Please input the correct option.");
		}

		String str1, str2;

		System.out.println("We are now comparing 2 strings and finding which one will comefirst in a dictionary!!");
		System.out.println("Please enter 2 strings of length 4.");
		System.out.println("Enter string 1:");
		str1 = in.next();
		System.out.println("Enter string 2:");
		str2 = in.next();

		if(str1.compareToIgnoreCase(str2) < 0){
			System.out.println("First String is: " + str1);
			System.out.println("Second String is: " + str2);
		}
		else{
			System.out.println("First String is: " + str2);
			System.out.println("Second String is: " + str1);
		}
		
		
		in.close();

	}
}
