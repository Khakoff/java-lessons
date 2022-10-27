package de.telrun.khakov.rustam.homework11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class HW2Second {
	public static void main(String[] args) {
		//С 8 до 20 часов температура воздуха измерялась ежечасно. Известно, что в течение этого
		// времени температура понижалась. Определите, в котором часу была впервые отмечена отрицательная температура.
		int[] degrees = {6, 6, 5, 4, 3, 3, 2, 0, -1, -1};
		Random random = new Random();
		int shift = 1;
		for (int i = 0; i < 13; i++) {
			degrees[i] = random.nextInt(1) - shift + 10;
			shift += 1;
		}
		// 0 1 2 3 4 5 6 7 8 9 ...
		System.out.println(Arrays.toString(degrees));
		int firstTemp = 0;
		for (int i = 0; i < 13; i++) {
			if (degrees[i] < 0) {
				firstTemp = i + 8;
				break;
			}
		}
		System.out.println(firstTemp);

		int max = 0;
		for (int i = 0; i < degrees.length; i++) {
			int abs = Math.abs(degrees[i]);
			if (abs > max) {
				max = abs;
			}
		}
	}
}
