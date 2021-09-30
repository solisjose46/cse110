import java.util.Scanner;

public class CommandTemplate
{
	public static void main (String [] args)
	{
		char command;
		Scanner in = new Scanner(System.in);
		int num0 = 0;
		int num1 = 0;
		String temp;

		do{
			System.out.println("Choose (A: add data), (R: refresh data), (D: display date) or (Q: Quit)");
			temp = in.next();
			command = temp.toUpperCase().charAt(0);
			System.out.println(command);
			if(command == 'A'){
				System.out.println("Input 0s and 1s in one line");
				while(in.hasNextInt()){
					int input = in.nextInt();
					if(input == 0){
						num0++;
					}
					else if(input == 1){
						num1++;
					}
				}
			}
			else if(command == 'R'){
				System.out.println("The data is refreshed");
				num0 = 0;
				num1 = 0;
			}
			else if(command == 'D'){
				System.out.println("Display the result");
				System.out.printf("\n%4s|", "Num0");
				for(int i = 0; i < num0; i++){
					System.out.print("*");
				}
				System.out.printf("\n%4s|", "Num1");
				for(int i = 0; i < num1; i++){
					System.out.print("*");
				}
				System.out.println();

			}
			else if(command == 'Q'){
				System.out.println("*** End of Program ***");
			}
			else{
				System.out.println("Invalid command, try again");
			}
			System.out.println();
		}while(command != 'Q');
	}
}
