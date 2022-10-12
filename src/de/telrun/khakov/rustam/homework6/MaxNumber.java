package de.telrun.khakov.rustam.homework6;

/**
 * @author Rustam Khakov
 */
public class MaxNumber {
	public static void main(String[] args) {
		int firstNumber = 11;
		int secondNumber = 10;
		int thirdNumber = 12;
		if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			System.out.println(firstNumber);
		} else if(secondNumber> thirdNumber){
			System.out.println(secondNumber);
		} else {
			System.out.println(thirdNumber);
		}
	}
}
