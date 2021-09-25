//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Assignment2.java
// Description: Reads user input to answer questions displayed and calculates desired user output with desired format
// Date: 09/24/2021
//***************************************************************

import java.util.Scanner;

public class Assignment2
{
	public static void main (String [] args)
	{
		//***************
		// Part 1
		//****************
		// a) Wrong cases are 1 6 4 and 6 1 4 and output for both is 1 0 6
		//because line 23 was empty middle was not updated. It was not updated because
		//c is the middle value so the conditons (c - small < 0) and (c - large > 0)
		//were false.
		
		// b) line 23
		//else { middle = c; }
		
		// c) because Y is greater than M lexicographically, str1.compareTo(str2)
		//returns a number greater than zero therefore the statement is true
		
		// d) because uppercase is lexicographically less than lower case,
		//a.compareTo(b) returns a negative number, -32
		
		// e) if(str.toUpperCase().compareTo("A") >= 0 && str.toUpperCase().compareTo("Z") <=0)
		//if this line of code is true then str is an alphabet letter

		//***************
		// Part 2
		//****************
		
		System.out.println("*** TASK: Read name and display them in alphabetic order ***");
		
		String name1 = "";
		String name2 = "";
		String name3 = "";
		String testFirstCharacter = "";
		String toPrint = "";
		
		Scanner input = new Scanner(System.in);
		
		//test first name
		System.out.print("Please input the first name: ");
		name1 = input.next();
		name1 = name1.toUpperCase();
		testFirstCharacter = name1.substring(0,1);
		if(testFirstCharacter.compareTo("A") >= 0 && testFirstCharacter.compareTo("Z") <=0){
			toPrint = name1;
			System.out.println("\t" + toPrint);
		}
		else{
			name1 = "";
			System.out.println("\tError: The first letter should be an alphabet"); 
		}

		//test second name
		System.out.print("Please input the second name: ");
		name2 = input.next();
		name2 = name2.toUpperCase();
		testFirstCharacter = name2.substring(0,1);
		if(testFirstCharacter.compareTo("A") >= 0 && testFirstCharacter.compareTo("Z") <=0){
			if(name1.length() == 0){
				toPrint = name2;
			}
			else{
				if(name1.compareTo(name2) <= 0){
					toPrint = name1 + ", " + name2;
				}
				else{
					toPrint = name2 + ", " +  name1;
				}
			}
			System.out.println("\t" + toPrint);
		}
		else{
			name2 = "";
			System.out.println("\tError: The first letter should be an alphabet"); 
		}

		//test third name
		System.out.print("Please input the third name: ");
		name3 = input.next();
		name3 = name3.toUpperCase();
		testFirstCharacter = name3.substring(0,1);
		if(testFirstCharacter.toUpperCase().compareTo("A") >= 0 && testFirstCharacter.toUpperCase().compareTo("Z") <=0){
			if(toPrint.length() == 0){
				toPrint = name3;
			}
			else{
				if(name1.length() == 0 || name2.length() == 0){
					if(toPrint.substring(0,toPrint.length() - 1).compareTo(name3) <= 0){
						toPrint = toPrint + ", " + name3;
					}
					else{
						toPrint = name3 + ", " + toPrint;
					}
				}
				else{
					if(name1.compareTo(name2) <= 0){
						if(name2.compareTo(name3) <= 0){
							toPrint = toPrint + ", " + name3;
						}
						else if(name1.compareTo(name3) <= 0){
							toPrint = name1 + ", " + name3 + ", " +  name2;
						}
						else{
							toPrint = name3 + ", " + toPrint;
						}
					}
					else{
						if(name1.compareTo(name3) <= 0){
							toPrint = toPrint + ", " + name3;
						}
						else if(name2.compareTo(name3) <= 0){
							toPrint = name2 + ", " + name3 + ", " + name1;
						}
						else{
							toPrint = name3 + ", " + toPrint;
						}
					
					}
				}
			}
			System.out.println("\t" + toPrint);
		}
		else{
			System.out.println("\n\tError: The first letter should be an alphabet"); 
		}

		System.out.println("\n*** END OF Assignment#2 ***");
	}
}
