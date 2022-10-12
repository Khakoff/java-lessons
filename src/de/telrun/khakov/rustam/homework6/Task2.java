package de.telrun.khakov.rustam.homework6;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task2 {
	public static void main(String[] args) {
		double price = 0.5;
		Scanner scanner = new Scanner(System.in);
		int howMuchIWant = scanner.nextInt();
		double money = scanner.nextDouble();
		if (price * howMuchIWant <= money) { // price * howMuchIWant <= money
			System.out.println("можем купить");
		}
	}
}
