package de.telrun.khakov.rustam.classwork7;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class CW1 {
	public static void main(String[] args) {
		String str = "someString";
		Random random = new Random();
		System.out.println(random);
		if (str.equals("someString")) { // сравнение строк, объектов, не примитивов через .equals

		}
		int month = 10;
		if (month == 1) {
			System.out.println("Январь");
		} else if (month == 2) {
			System.out.println("Фев");
		} else if (month == 3) {
			System.out.println("Март");
		} else if (month == 4) {
			System.out.println("Апр");
		} else if (month == 5) {
			System.out.println("Май");
		} else if (month == 6) {
			System.out.println("Июнь");
		} else if (month == 7) {
			System.out.println("Июль");
		} else if (month == 8) {
			System.out.println("Авг");
		} else {
			System.out.println(" другой месяц");
		}
		int feb = 2;
		int day = 3;
		switch (month) {
			case 1:
			case 2:
			case 3:
				if (day > 15) {
					System.out.println("");
				} else {
					System.out.println("fas");
				}
				System.out.println(" 1 kvartal");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("2 kvartal");
				break;
			default:
				System.out.println(" другой месяц");
		}
		String weather = "Солнце";
		switch (weather) {
			case "Солнце":
				System.out.println("все ок");
				break;
			case "Дождь":
				System.out.println("дождик пошел");
				break;
			default:
				System.out.println("значение не понятно");
		}


		String languageCode = "en";
		if (languageCode.equals("en")) {
			System.out.println("англ");
		} else if (languageCode.equals("de")) {
			System.out.println("немецкий");
		} else if (languageCode.equals("jp")) {
			System.out.println("японский");
		} else if (languageCode.equals("tr")) {
			System.out.println("турецкий");
		} else if (languageCode.equals("he")) {
			System.out.println("иврит");
		} else {
			System.out.println("нет поддержки");
		}


		switch (languageCode) {
			case "en":
				System.out.println("англ");
				break;
			case "de":
				System.out.println("немецкий");
				break;
			case "jp":
				System.out.println("японский");
				break;
			case "tr":
				System.out.println("турецкий");
				break;
			case "he":
				System.out.println("иврит");
				break;
			default:
				System.out.println("нет поддержки");
		}

//		int val =
//				switch (languageCode) {
//					case "en" -> 1;
//					case "de" -> 2;
//				};

	}

	public static String isFirst6Month(int month) {
		return month > 6
				? "второе полугодие"
				: "первое полугодие";
	}

	public static int is(Object o) {
		return switch (o) {
			case Integer i -> i++;
			case String s->Integer.parseInt(s);
			default -> 0;
		};
	}
}
