package de.telrun.khakov.rustam.classwork8;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class ForExample {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int from = 1;//scanner.nextInt(); //25
		int to = 50;//scanner.nextInt(); //5
		for (int i = from; i <= to; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
