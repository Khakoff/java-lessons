package de.telrun.khakov.rustam.homework11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class HW {

	public static void main(String[] args) {
		int size = 100;
		int bound = 200;
		int[] arr = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(bound);
			System.out.println(arr[i] * 2);
		}
		System.out.println(Arrays.toString(arr));
	}
}
