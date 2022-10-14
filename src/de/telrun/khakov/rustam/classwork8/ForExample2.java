package de.telrun.khakov.rustam.classwork8;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class ForExample2 {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//
//		for (int i = 10; i >0; i--) {
//			System.out.println(i);
//		}
//		System.out.println();

//		for (int i = 0; i < 10; i++) {
//			System.out.println(10 - i);
//		}
		//Вывести на консоль сумму четных чисел от 20 до 40
		int sum = 0;
		for (int i = 20; i < 40; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		//Напишите программу, где пользователь вводит любое целое положительное число.
		//А программа суммирует все числа от 1 до введенного пользователем числа.
//		Scanner scanner = new Scanner(System.in);
//		int to = scanner.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= to; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
	}
}
