package de.telrun.khakov.rustam.homework11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class HW3 {
	public static void main(String[] args) {
//		Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.
//Например, дан массив [3, 9, 8, 4, 5, 1]. Следует вывести числа 9 и 5, так как перед ними стоят
// соответственно числа 3 и 4, которые меньше их.
		int[] arr = new int[20];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(50);
		}

		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				System.out.println(arr[i]);
			}
		}

	}
}
