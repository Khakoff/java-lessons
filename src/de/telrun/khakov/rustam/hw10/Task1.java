package de.telrun.khakov.rustam.hw10;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	public static void main(String[] args) {
		for (int i = 10; i < 200; i++) {
			int reversed = reversed(i);
			if (isFullSquare(reversed + i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isFullSquare(int num) {
		double sqrt = Math.sqrt(num);
		int sqrtVal = (int) sqrt;
		return (sqrtVal * sqrtVal) == num;
	}

	static int reversed(int i) { // 1
		int reversed = 0;
		while (i > 0) {
			reversed = reversed * 10 + i % 10;
			i = i / 10;
		}
		return reversed;
	}
}
