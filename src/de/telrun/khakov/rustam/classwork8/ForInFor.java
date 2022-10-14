package de.telrun.khakov.rustam.classwork8;

/**
 * @author Rustam Khakov
 */
public class ForInFor {

	public static void main(String[] args) {
		// двузначные числа и найти все такие пары чисел, у которых одно чило делится на другое
		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				if (i % j == 0 && i != j) {
					System.out.println(i + " делится на " + j);
				}
			}
		}
	}
}
