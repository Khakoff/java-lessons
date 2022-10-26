package de.telrun.khakov.rustam.classwork11;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class Practive {
	public static void main(String[] args) {
		int howManyNumbers = 100;
		int[] array = new int[howManyNumbers / 2];
		int j = array.length -1;
		for (int i = 0; i < howManyNumbers; i++) {
			if (i % 2 == 1) {
				array[j] = i;
				j--;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
