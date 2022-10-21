package de.telrun.khakov.rustam.classwork10;

/**
 * @author Rustam Khakov
 */
public class CW3 {
	public static void main(String[] args) {
		// нечетные числа
		int sumOfEvenNumbers = 0;
		for (int i = 0; i < 100; i++) {
			if (sumOfEvenNumbers >10) {
				break;
			}
			if (i % 2 != 0) {
				System.out.println("не четное");
				continue;
			}
			sumOfEvenNumbers++;
			sumOfEvenNumbers += i;
			if (true) {
				System.out.println("четное");
			}

		}
	}
}

