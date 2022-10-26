package de.telrun.khakov.rustam.classwork11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class RandomAray {
	public static void main(String[] args) {
		int[] arrray = new int[15];
		Random random = new Random();
		for (int i = 0; i < arrray.length; i++) {
			arrray[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(arrray));
		int max = 0;
		for (int i = 0; i <arrray.length; i++) {
			if (max < arrray[i]) {
				max = arrray[i];
			}
		}
		System.out.println(max);
	}
}
