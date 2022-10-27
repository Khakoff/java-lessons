package de.telrun.khakov.rustam.classwork12;

/**
 * @author Rustam Khakov
 */
public class ArraysTest {
	public static void main(String[] args) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December"};
		//для элемента i = 0 пока он меньше длины массива делай и потом увелисчивай индекс
		for (int i = 0; i < months.length; i++) {
			String month = months[i]; //достань элемент из массива с индексом i
			//Payload
			months[i] = "July";
			System.out.println(month);
		}
		// для каждого элемента массива (month) из массива months делай
		for (String month : months) { //for-each
			System.out.println(month);
		}



		//ternary operator
		String msg;
		if (months.length > 3) {
			msg = "Yes";
		} else {
			msg = "No";
		}
		msg = months.length > 3 ? "Yes" : "No";

		int[] arr = {1,3,6,4,3,2,5,4,1,3,4};
		int sum = 0;
		for (int val: arr) {
			sum +=val;
		}
	}
}
