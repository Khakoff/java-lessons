package de.telrun.khakov.rustam.classwork9;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task3 {
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(50);
		System.out.println(number);

		for (int i = 0; i <= number; i++) {
			for (int j = 0; j < number/2; j++) {
				if (i + j == number) {
					System.out.println(i + " и " + j);
				}
			}
		}
	}
}
