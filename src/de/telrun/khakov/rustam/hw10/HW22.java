package de.telrun.khakov.rustam.hw10;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class HW22 {
	public static void main(String[] args) {
		//private -> protected -> ""(package) -> public
		// static -> один на весь класс и можно запускать не создавая экземлпяра
		// void/ int/String
		//method name
		// String[] arg
		//Проверка гипотезы Сиракуз
		//Возьмем любое натуральное число. Если оно четное - разделим его пополам, если нечетное -
		// умножим на 3, прибавим 1 и разделим пополам. Повторим эти действия с вновь полученным числом.
		// Гипотеза гласит, что независимо от выбора первого числа рано или поздно мы получим 1.

		int number = new Random().nextInt(100);
		System.out.println(number);
		int howMuchTried = 0;
		while (number != 1) {
			howMuchTried++;
			if (number % 2 == 0) {
				number /= 2;
			} else {
				number = (number * 3 + 1) / 2;
			}
		}
		System.out.println("теорема доказана " + howMuchTried);
	}
}
