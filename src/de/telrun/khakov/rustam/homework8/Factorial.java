package de.telrun.khakov.rustam.homework8;

/**
 * @author Rustam Khakov
 */
public class Factorial {
	public static void main(String[] args) {
		int factNumber = 5; // 1 * 2 * 3 * 4 * 5
		int factRes = 1;
		for (int i = 1; i <= factNumber; i++) {
			factRes = factRes * i;
		}

	}
}
