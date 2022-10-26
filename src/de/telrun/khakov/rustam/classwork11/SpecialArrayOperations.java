package de.telrun.khakov.rustam.classwork11;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class SpecialArrayOperations {
	public static void main(String[] args) {
		int[] arrayOne = new int[5];
		arrayOne[0] = 1;
		arrayOne[1] = 45;
		arrayOne[2] = 56;
		arrayOne[3] = 46;
		arrayOne[4] = 47;


		int[] arrayTwo = new int[6];
		for (int i = 0; i < arrayOne.length; i++) {
			arrayTwo[i] = arrayOne[i];
		}
		int[] arrayThree = Arrays.copyOf(arrayOne,6);
		int[] arrayFour = Arrays.copyOfRange(arrayOne, 2, 5);

		int[] arrayFour1 = new int[3];
		for (int i = 2, j = 0; i < 5; i++,j++) {
			arrayFour1[j] = arrayOne[i];
		}

		arrayTwo[5] = 56;
		int[] arrayFive = arrayOne.clone();

		System.out.println(Arrays.toString(arrayOne));
		arrayFive[2] = 1;
		Arrays.sort(arrayOne);
		System.out.println(Arrays.toString(arrayOne));
		System.out.println(Arrays.toString(arrayFive));


	}
}
