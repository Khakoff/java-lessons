package de.telrun.khakov.rustam.classwork10;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class CW1 {

	public static void main(String[] args) {
		// 21
		Random random = new Random();
		int currVAl;
		int sum = 0;
		boolean humanDecision = true;
		Scanner scanner = new Scanner(System.in);
		do {
			humanDecision = true;
			currVAl = random.nextInt(11) + 1;
			System.out.println(currVAl);
			sum += currVAl;
			if (sum > 11) {
				System.out.println("Сумма " + sum);
				System.out.println("Надо еще?");
				humanDecision = scanner.nextBoolean();
			}
		} while (sum < 21 && humanDecision);
		System.out.println(sum);
		System.out.println(sum > 21 ? "проиграл" : "выиграл");
	}
}
