import java.util.Scanner;

public class ThreeInteger {
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		int a = 0; int b = 0; int c = 0; int small = 0; int middle = 0; int large = 0;
		boolean isValid = true;

		System.out.println("Input the first integer");
		
		if(scanner.hasNextInt() && isValid){
			a = scanner.nextInt();
		}
		else{
			isValid = false;
		}

		System.out.println("Input the second integer");
		
		if(scanner.hasNextInt() && isValid){
			b = scanner.nextInt();
		}
		else{
			isValid = false;
		}

		System.out.println("Input the third integer");

		if(scanner.hasNextInt() && isValid){
			c = scanner.nextInt();
		}
		else{
			isValid = false;
		}

		if(isValid){
			if(b - a > 0){
				small = a;
				large = b;
			}
			else{
				small = b;
				large = a;
			}

			if(c - small < 0){
				middle = small;
				small = c;
			}
			else if(c - large > 0){
				middle = large;
				large = c;
			}
			else{
				//System.out.printf("A B C is %d %d %d\n", a, b, c);
				middle = c;
			}
			System.out.printf("The numbers are %d %d %d.\n", small, middle, large);
		}
		else{
			System.out.println("The input was invalid");
		}
	}
}
