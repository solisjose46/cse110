//***********************************************************  
// Name: Jose Solis Salazar
// Title: Assigment7
// Description: Driver for CardList.java
// Time spent: approx. 4 hours
// Date: 11/16/21
//********************************************************** 


import java.util.*;

public class Assignment7 {
   public static void main (String[] args) {

       Scanner console = new Scanner (System.in);
       String choice;
       char command;

       System.out.println("*** Start of Program ***");
       printMenu();

       CardList cards = null;
       int num = 0;

       do
       {
	       System.out.println("\n[Please enter a command or type ?] ");
	       choice = console.next().toLowerCase();
	       command = choice.charAt(0);

	       switch (command)
	       {
		       case 'a':
			       System.out.println("\ta [Create new cards]");
			       System.out.println("\t[Input the size of cards]: ");
			       num = console.nextInt();

			       cards = new CardList(num);
			       System.out.println(cards.getHistory());
			       break;
		       case 'b':
			       System.out.println("\tb [flip the cards]");
			       cards.flip();
			       System.out.println(cards.getHistory());
			       break;
		       case 'c':
			       System.out.println("\tc [shift the cards]");
			       cards.shift();
			       System.out.println(cards.getHistory());
			       break;
		       case 'd':
			       System.out.println("\td [shuffle the cards]");
			       cards.shuffle();
			       System.out.println(cards.getHistory());
			       break;
		       case 'e':
			       System.out.println("\te [Change the cards]");
			       System.out.println("\tInput the number of cards to change]:");
			       num = console.nextInt();

			       cards.change(num);
			       System.out.println(cards.getHistory());
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
   }

   public static void printMenu()
   {
	   System.out.print(
				   "\nCommand Options\n"
				   +"-----------------------------------\n"
				   +"a: Create new cards\n"
				   +"b: flip the cards\n"
				   +"c: shift the cards\n"
				   +"d: shuffle the cards\n"
				   +"e: change the cards\n"
				   +"?: Display the menu again\n"
				   +"q: Quit this program\n\n");
   }
}


