package de.telrun.khakov.rustam.homework9;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class MaxDigit {
	public static void main(String[] args) {
		//3)Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
		Random random = new Random();
		int number = random.nextInt(); /// 100    899 + 100 -> 999
		int max = 0;
		System.out.println(number);
		while (number != 0) {
			int currentDigit = number % 10; // 36 (7)
			if (currentDigit > max) {
				max = currentDigit;
			}

			number = number / 10; // 36

		}
		System.out.println(max);
	}
}
