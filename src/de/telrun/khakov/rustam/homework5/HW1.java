package de.telrun.khakov.rustam.homework5;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class HW1 {
	public static void main(String[] args) {
		boolean isRain = false;
		boolean isWeekend = true;
		boolean canWalk = isWeekend && !isRain;
		System.out.println("Можем ли мы гулять? " + canWalk);

		boolean isEdekaOpen = false;
		boolean isReweOpen = false;
		boolean canBuy = isEdekaOpen || isReweOpen; //  открыт ли едека или открыт реве
		System.out.println("Можем ли мы схожить в магазин и купить что-то? " + canBuy);

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(isDividedFor7And5(number));
 			int length = 1; // считали длину...
		boolean isMoreThan10 = length>10;

		/// Прибор работает корректно, если температура
		// первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод,
		// который проверяет это устройство. Ваша программа должна иметь переменные temperature1 и temperature2.
		// В результате он выводит сообщение true или false.
		// если темп1 > 100 и температ2 < 100 -> хорошо
		//int temperature1 = 9;
		//int temperature2 = 45;
		// boolean correctWork = temperature1 > 100 && temperature2 < 100;
	}

	static	boolean  isDividedFor7And5(int number) {
		boolean isDivedFor7 = number % 7 == 0;
		boolean isDivedFor5 = number % 5 == 0;
		return  isDivedFor5 && isDivedFor7; /// остаток от деления на 7 = 0 и остаток от деления на 5 тоже раыен 0
	}
}
