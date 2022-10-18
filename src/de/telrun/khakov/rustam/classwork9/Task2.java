package de.telrun.khakov.rustam.classwork9;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task2 {
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100);
		Scanner scanner = new Scanner(System.in);

		int secondPlayerNumber;
		int howMuchWeGuess = 0;
		do {
			secondPlayerNumber = scanner.nextInt();
			if (number > secondPlayerNumber) {
				System.out.println(" нет, больше ");
			} else if (number < secondPlayerNumber) {
				System.out.println(" нет, меньше ");
			}
			howMuchWeGuess++;
		} while (secondPlayerNumber != number);
		System.out.println("Угадал: " + number + " потратил " + howMuchWeGuess + " попыток");
	}
}
