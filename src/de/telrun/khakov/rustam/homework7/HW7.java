package de.telrun.khakov.rustam.homework7;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class HW7 {
	public static void main(String[] args) {
//		Пользователь вводит число от 1 до 9999 (сумму выдачи в банкомате). Необходимо вывести на экран словами введенную
//		сумму и в конце написать название валюты с правильным окончанием. Например: 7431 – семь тысяч четыреста тридцать
//		один доллар, 2149 – две тысячи сто сорок девять долларов, 15 – пятнадцать долларов, 3 – три доллара. Для решения
//		этой задачи вам необходимо будет применять оператор % (остаток от деления)
//1 доллар
//2 доллара
//3 доллара
//4 доллара

//5 долларов
//6 долларов
//7 долларов
//8 долларов
//9 долларов
//0 долларов

		Random rand = new Random();
		int number = 4511;
		// 123  4  1234 / 10 = 123 и остаток 4  1234 % 10 -> 4
		//13565678
		//7645
		int thousands = number / 1000; //1   234 ->
		int hundreds = (number % 1000) / 100; // 2
		int decades = (number % 1000) % 100 / 10; //3
		int lastDigit = number % 10; //4


		switch (thousands) {
			case 1:
				System.out.print("одна тысяча ");
				break;
			case 2:
				System.out.print("две тысячи ");
				break;
			case 3:
				System.out.print("три тысячи ");
				break;
			case 4:
				System.out.print("четыре тысячи ");
				break;
			case 5:
				System.out.print("пять тысяч ");
				break;
			case 6:
				System.out.print("шесть тысяч ");
				break;
			case 7:
				System.out.print("семь тысяч ");
				break;
			case 8:
				System.out.print("восемь тысяч ");
				break;
			case 9:
				System.out.print("девять тысяч ");
				break;
			case 0:
				break;
		}
		switch (hundreds) {
			case 1:
				System.out.print("сто");
				break;
			case 2:
				System.out.print("двести");
				break;
			case 3:
				System.out.print("триста");
				break;
			case 4:
				System.out.print("четыреста");
				break;
			case 5:
				System.out.print("пятьсот");
				break;
			case 6:
				System.out.print("шестьсот");
				break;
			case 7:
				System.out.print("семьсот");
				break;
			case 8:
				System.out.print("восемьсот");
				break;
			case 9:
				System.out.print("девятьсот");
				break;
			case 0:
				break;
		}
// case 1: ""

		System.out.println("");

		switch (lastDigit) {
			case 1:
				if (decades == 1) {
					System.out.println(number + " долларов");
				} else {
					System.out.println(number + " доллар");
				}
				break;
			case 2:
			case 3:
			case 4:
				if (decades == 1) {
					System.out.println(number + " долларов");
				} else {
					System.out.println(number + " доллара");
				}
				break;
			default:
				System.out.println(number + " долларов");
		}


	}
}
