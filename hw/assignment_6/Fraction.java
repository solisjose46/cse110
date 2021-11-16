//***************************************************************
// Name: Jose Solis Salazar
// Lab Letter: D
// Title: Fraction.java
// Description: class definition of Fraction
// Date: 11/05/21
//***************************************************************

import java.lang.Math;

class Fraction
{
	int numerator;
	int denominator;

	public Fraction(int numerator, int denominator){
		if(denominator != 0){
			this.numerator = numerator;
			this.denominator = denominator;	
			this.simplify();
		}
		else{
			System.out.println("Error: denominator should not be 0");
			this.numerator = 0;
			this.denominator = 1;	
		}
	}

	public Fraction(){
		this.numerator = 0;
		this.denominator = 1;
	}

	@Override
	public String toString(){
		String toReturn;

		if(this.numerator == 0){
			toReturn = "0";
		}
		else if(this.denominator == 1){
			toReturn = String.valueOf(this.numerator);
		}
		else{
			toReturn = String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
		}
		return toReturn;
	}

	private int greatestCommonDivisor(int one, int two){
		int smaller = Math.abs(one);
		int bigger = Math.abs(two);
		int difference = 0;
		int temp = 0;

		do{
			if(smaller >= bigger){
				temp = bigger;
				bigger = smaller;
				smaller = temp;
			}

			int result = bigger - smaller;

			if(result > 0){
				difference = result;
			}
			bigger = result;

		
		}while(smaller != 0 && bigger != 0);
		
		return difference;

	}

	private void simplify(){
		//case 1
		if(this.denominator < 0){
			this.denominator*=-1;
			this.numerator*=-1;
		}
		//case2
		int gcd = this.greatestCommonDivisor(this.numerator, this.denominator);
		if(gcd != 0){
			this.numerator/=gcd;
			this.denominator/=gcd;	
		}

	}

	public static Fraction multiply(Fraction a, Fraction b){
		Fraction c;

		int newNumerator = a.numerator * b.numerator;
		int newDenominator = a.denominator * b.denominator;
		
		c = new Fraction(newNumerator, newDenominator);

		return c;
	}

	public static Fraction divide(Fraction a, Fraction b){
		Fraction c;

		int newNumerator = a.numerator * b.denominator;
		int newDenominator = a.denominator * b.numerator;
		
		c = new Fraction(newNumerator, newDenominator);

		return c;
	}
	public static Fraction add(Fraction a, Fraction b){
		Fraction c;
		int newNumerator = (b.denominator * a.numerator) + (a.denominator * b.numerator);
		int newDenominator = (a.denominator * b.denominator);

		c = new Fraction(newNumerator, newDenominator);
		
		return c;
	}

	public static Fraction subtract(Fraction a, Fraction b){
		Fraction c;
		int newNumerator = (b.denominator * a.numerator) - (a.denominator * b.numerator);
		int newDenominator = (a.denominator * b.denominator);

		c = new Fraction(newNumerator, newDenominator);

		return c;
	}
}
