package de.telrun.khakov.rustam.homework8;

/**
 * @author Rustam Khakov
 */
public class Task23 {
	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
				count++;
			}
		}
		System.out.println(sum / count);

	}
}
