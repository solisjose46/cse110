//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Five Cards
// Description: Object that represents five cards, can change cards and calculate score
// Date: 10/08/21
//***************************************************************

import java.lang.Math;

public class FiveCards
{
	//Object data
	private String cards;
	private int score;
	private int changes;
	private String history;

	//default constructor
	public FiveCards(){
		this.cards = "";
		this.score = 0;
		this.changes = 0;
		this.history = "";
	}

	//private methods
	private int calculatePair(char c){
		int num = 0;
		for(int i = 0; i < this.cards.length(); i++){
			if(this.cards.charAt(i) == c){
				num++;
			}
		}
		return num;
	}

	//public methods
	public void setCard(String str){
		this.cards = str;
		this.changes++;
	}

	public void changeOne(int pos){
		String deck = "1234567890JQK";
		if(0 <= pos && pos <= 4){
			char newCard = deck.charAt((int)(Math.random() * deck.length()));
			String newHand;
			if(pos == 0){
				newHand = newCard + this.cards.substring(pos+1);
			}
			else if(pos == 4){
				newHand = this.cards.substring(0, pos) + newCard;
			}
			else{
				newHand = this.cards.substring(0, pos) + newCard + this.cards.substring(pos+1);
			}
			this.cards = newHand;
			this.changes++;
		}
		else{
			System.out.println("position must between 0 and 4");
		}	
	}
	
	public void calculateScore(){
		int position = 0;
		int count = 0;
		this.score = 0;

		while(position < this.cards.length()){
			char search = this.cards.charAt(position);
			count = calculatePair(search);
			if(count == 3){
				this.score+=3;
			}	
			else if(count == 2){
				this.score+=1;
			}

			do{
				position++;
			}while(position < this.cards.length() && this.cards.charAt(position) == search);
		}
		this.history = this.history + this.cards + " " + this.score + " " + this.changes + "\n";
	}

	public String displayData(){
		String header = "[Cards][Score][Changes]\n";
		return header + this.history;
	}
}
