package de.telrun.khakov.rustam.hw10;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class HW2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int counter = 0;
		while (true) {
			i = scanner.nextInt();
			if (i <= 2) {
				break;
			}
			if (isPrime(i)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	private static boolean isPrime(int i) { // 1 и на самого себя
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
