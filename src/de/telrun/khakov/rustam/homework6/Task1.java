package de.telrun.khakov.rustam.homework6;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	public static void main(String[] args) {
		Random random  = new Random();
		int year =  random.nextInt(83) + 1940; /// 1940 - 2022
		boolean isLeapYear = isLeapYear(year);
		System.out.println(year);
		if (isLeapYear) {
			System.out.println("Високосный год");
		} else {
			System.out.println("Не високосный год");
		}
	}

	public static boolean isLeapYear(int year) {
		return year % 4 == 0;
	}
}
