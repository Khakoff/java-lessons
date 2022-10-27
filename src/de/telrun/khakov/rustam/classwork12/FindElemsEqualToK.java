package de.telrun.khakov.rustam.classwork12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class FindElemsEqualToK {
	public static void main(String[] args) {
		int k = 4;
		int[] arr = new int[20];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > k) {
				continue;
			}
			for (int j = 0; j < arr.length - i; j++) {
				if (i != j && arr[j] + arr[i] == k) {
					System.out.println(i + " : " + j);
				}
			}
		}

	}
}
