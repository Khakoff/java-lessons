package de.telrun.khakov.rustam.homework8;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		calcOddNumber();
		long after = System.currentTimeMillis();
		System.out.println("Optimized method" + (after - before));

		long beforeOld = System.currentTimeMillis();
		calcOddNumberOld();
		long afterOld = System.currentTimeMillis();
		System.out.println("Not optimized method " + (afterOld - beforeOld));

	}

	private static void calcOddNumber() {
		long number = 100_000_000L;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("не простое");
				return;
			}
		}
		System.out.println("простое");
	}

	private static void calcOddNumberOld() {
		long number = 100_000_000L;
		int dividerCount = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				dividerCount++;
			}
		}
		if (dividerCount == 0) {
			System.out.println("простое");
		} else {
			System.out.println("не простое");
		}
	}
}
