//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Assignment4.java
// Description: Make cards, calculate score, display history and changes
// Date: 10/08/21
//***************************************************************

import java.util.Scanner;

public class Assignment4
{
	public static void main (String [] args)
	{		
		char command;
		Scanner in = new Scanner(System.in);
		FiveCards myCards = new FiveCards();
		do{
			//get users command
			System.out.println("Choose  (A: new), (B: changeOne),  (C: Display),  or (Q: quit)");
			command = in.next().toUpperCase().charAt(0);

			if(command == 'A'){
				System.out.println("*** Make A new FiveCards*** ");
				in.nextLine();
				System.out.println("Type five letters without space");
				String str = in.nextLine();
				myCards.setCard(str);
				myCards.calculateScore();
				System.out.println(myCards.displayData());
			}
			else if(command == 'B'){
				System.out.println("*** Change One Card***");
				System.out.println("Type one position to change");
				int pos = in.nextInt();
				String lineBreak = in.nextLine();//to skip the line break
				myCards.changeOne(pos);
				myCards.calculateScore();
				System.out.println(myCards.displayData());
			}
			else if(command == 'C'){
				System.out.println("*** Display Data***");
				System.out.println(myCards.displayData());
			}
			else if(command == 'Q'){
				System.out.println("*** End of program ***");
			}
			else{
				System.out.println(" *** Invalid command. Try Again *** ");
			}
		}while(command != 'Q');
		//dont forget to close the scanner
		in.close();
	}
}
