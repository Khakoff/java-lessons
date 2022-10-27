package de.telrun.khakov.rustam.homework11;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class HWSecond {
	public static void main(String[] args) {
		//Дан массив(сгенерируйт значения). Найти среднее арифметическое его элементов. Вывести на экран только
		// те элементы массива, которые больше найденного среднего арифметического.
		int[] arr = new int[100];
		Random random = new Random();
		double median = 0.0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
			sum += arr[i];
		}
		median = sum / arr.length;
		System.out.println("Median: " + median);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > median) {
				System.out.println(arr[i]);
			}
		}
	}
}
