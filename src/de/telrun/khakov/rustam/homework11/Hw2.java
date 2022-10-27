package de.telrun.khakov.rustam.homework11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Hw2 {
	public static void main(String[] args) {
		//С 8 до 20 часов температура воздуха измерялась ежечасно. Известно, что в течение этого
		// времени температура понижалась. Определите, в котором часу была впервые отмечена отрицательная температура.
		int[] degrees = new int[24]; /// 0000 0000 0000 0000
		Random random = new Random();
		for (int i = 8; i <= 20; i++) {
			degrees[i] = random.nextInt(10) - 3;
		}
		// 0 1 2 3 4 5 6 7 8 9 ...
		System.out.println(Arrays.toString(degrees));
		int firstTemp = 0;
		for (int i = 8; i <= 20; i++) {
			if (degrees[i] < 0) {
				firstTemp = i;
				break;
			}
		}
		System.out.println(firstTemp);
	}
}
