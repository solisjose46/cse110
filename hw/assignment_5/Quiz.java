//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Quiz.java
// Description: class definition of Quiz
// Date: 10/22/21
//***************************************************************

class Quiz
{
	private String question;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private char answer;

	Quiz(String question, String a, String b, String c, String d, char ans){
		this.question = question;
		this.choiceA = a;
		this.choiceB = b;
		this.choiceC = c;
		this.choiceD = d;
		this.answer = ans;
	}
	
	public String displayQuiz(){
		String toReturn = "Q) " + this.question + "\nA) " + this.choiceA + "\nB) " + this.choiceB + "\nC) " + this.choiceC + "\nD) " + this.choiceD;
		return toReturn;
	}

	public void setQuestion(String question){
		this.question = question;
	}

	public void set4Choices(String a, String b, String c, String d){
		this.choiceA = a;
		this.choiceB = b;
		this.choiceC = c;
		this.choiceD = d;
	}

	private String getChoice(char choice){
		if(choice == 'A'){}
		else if(choice == 'A'){}
		else if(choice == 'A'){}
		else if(choice == 'A'){}
                                                                                                                                                                        
	}
}
