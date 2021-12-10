import java.util.Scanner;
import java.io.*;

class part1{

	public static void main(String args[]) throws FileNotFoundException{
		try{
			Delimiter a = new Delimiter("a", "[^A-Za-z]+");
			Delimiter b = new Delimiter("b","[^0-9]+");
			Delimiter c = new Delimiter("c","[^0-9]*");
			Delimiter d = new Delimiter("d","[0-9]+");
			Delimiter e = new Delimiter("e","[^0-9.0-9]+");

			Delimiter [] arr = {a, b, c, d, e};

			File file = new File("CSE110AB.txt");
			
			for(int i = 0; i < arr.length; i++){
				Delimiter obj = arr[i];

				System.out.println("\nLETTER:\t" + obj.name);
				System.out.println("---------------------");

				Scanner scan = new Scanner(file);
				
				scan.useDelimiter(obj.delimiter);

				while(scan.hasNext()){
					String parse = scan.next();
					System.out.print(parse + " ");
				}
				scan.close();
			}
			


		}
		catch(FileNotFoundException e){
			System.out.println("FILE NOT FOUND");
		}

	}
}

class Delimiter{
	public String name;
	public String delimiter;

	Delimiter(String name, String delimiter){
		this.name = name;
		this.delimiter = delimiter;
	}
}
