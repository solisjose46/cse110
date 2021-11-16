//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Assignment6.java
// Description: class definition of Fraction
// Date: 11/05/21
//***************************************************************

import java.util.*;

public class Assignment6 {
   public static void main (String[] args) {

       Scanner console = new Scanner (System.in);
       String choice;
       char command;
       // numbers used for input in the various cases
       int num1, num2;
       // print the men
       System.out.println("*** Start of Program ***");
       printMenu();
       // **********************************//
       // *** Constrcut a Fraction instance here *** //
       // **********************************//
       Fraction fraction = new Fraction(); // default 0/1 -> "0"
       do
       {
	       // ask a user to choose a command
	       System.out.println("Value: " + fraction.toString());
	       System.out.println("\n[Please enter a command or type ?] ");
	       choice = console.next().toLowerCase();
	       command = choice.charAt(0);
	       // For user input
	       int one, two;
	       one = 0;
	       two = 0;
	       Fraction newFraction;
	       switch (command)
	       {
		       case 'c':
			       // *****************************//
			       // *** Reset Fractions here *** //
			       // *****************************//
			       fraction = new Fraction();
			       break;
		       case '*':
			       System.out.println("[Enter two numbers for a fraction to MULTIPLY] ");
			       // **************************************//
			       // *** Call Fraction Multiply Method *** //
			       // **************************************//
			       console.nextLine();

			       one = console.nextInt();
			       two = console.nextInt();
			       
			       newFraction = new Fraction(one, two);
			       
			       System.out.print(fraction.toString() + " * " + newFraction.toString() + " = ");
			       
			       fraction = Fraction.multiply(fraction, newFraction);
			       
			       System.out.println(fraction.toString());
			       break;
		       case '/':
			       System.out.println("[Enter two numbers for a fraction to DIVIDE] ");
			       // ************************************//
			       // *** Call Fraction Divide Method *** //
			       // ************************************//
			       console.nextLine();

			       one = console.nextInt();
			       two = console.nextInt();
			       
			       newFraction = new Fraction(one, two);
			       
			       System.out.print(fraction.toString() + " / " + newFraction.toString() + " = ");
			       
			       fraction = Fraction.divide(fraction, newFraction);
			       
			       System.out.println(fraction.toString());
			       break;
		       case '+':
			       System.out.println("[Enter two numbers for a fraction to ADD] ");
			       // *********************************//
			       // *** Call Fraction Add Method *** //
			       // *********************************//
			       console.nextLine();

			       one = console.nextInt();
			       two = console.nextInt();
			       
			       newFraction = new Fraction(one, two);
			       
			       System.out.print(fraction.toString() + " + " + newFraction.toString() + " = ");
			       
			       fraction = Fraction.add(fraction, newFraction);
			       
			       System.out.println(fraction.toString());
			       break;
		       case '-':
			       System.out.println("[Enter two numbers for a fraction to SUBTRACT] ");
			       // **************************************//
			       // *** Call Fraction Subtract Method *** //
			       // **************************************//	
			       console.nextLine();

			       one = console.nextInt();
			       two = console.nextInt();
			       
			       newFraction = new Fraction(one, two);
			       
			       System.out.print(fraction.toString() + " + " + newFraction.toString() + " = ");
			       
			       fraction = Fraction.add(fraction, newFraction);
			       
			       System.out.println(fraction.toString());
			       break;
		       case '?':
			       printMenu();
			       break;
		       case 'q':
			       break;
		       default:
			       System.out.println("[Invalid input] " + command);
			       break;
	       }
       } while (command != 'q');
       System.out.println("*** End of Program ***");
       console.close();
   }  //end of the main method

   public static void printMenu()
   {
	   System.out.print(
				   "\nCommand Options\n"
				   +"-----------------------------------\n"
				   +"c: reset the value\n"
				   +"+: add a fraction to the current value\n"
				   +"-: subtract a fraction from the current value\n"
				   +"*: multiply a fraction to the current value\n"
				   +"/: divide the current value by a fraction\n"
				   +"?: display the menu again\n"
				   +"q: quit this program\n\n");
   } // end of the printMenu method
}


