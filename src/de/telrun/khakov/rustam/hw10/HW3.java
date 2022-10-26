package de.telrun.khakov.rustam.hw10;

/**
 * @author Rustam Khakov
 */
public class HW3 {
	public static void main(String[] args) {
		//Напишите метод, который принимает строку и два символа. В результате он возвращает заданную строку,
		// где каждый первый символ был заменен вторым символом. Вы должны использовать только методы length()
		// и charAt() класса String. Например: «Я всегда делаю домашнее задание», «a», «A» ->
		// «Я всегдА делАю домашнее зАдАние».
		//используйте циклы
		String str = "Я всегда делаю домашнее задание";
		String strAfter = getStrAfter(str, 'а','А');
		str.replace('а','А');
	}

	private static String getStrAfter(String str, char from, char to) {
		String strAfter = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == from) {
				strAfter +=to;
			} else {
				strAfter += c;
			}
		}
		return strAfter;
	}
}
