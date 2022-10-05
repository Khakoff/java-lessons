package de.telrun.khakov.rustam.classwork5;

/**
 * @author Rustam Khakov
 */
public class Operands {
	public static void main(String[] args) {
		int i = 10;
		i = i + 1;
		i++;
		i--;
		i = i / 2;
		i = i * 4;

		int val = 645; // ... 0000 0001 0000 0000
		val = val >> 1; // ... 0000 0001 0000 00

		int val1 = 567;
		int val2 = 456;

		boolean isEquals = val1 == val2; // реалиционный операнд true or false
		boolean isGreatThan = val1 > val2; // true or false;
		boolean isGreatOrEquals = val1 >= val2;
		boolean isNotEquals = val1 != val2; // true
		// ==  >= <= > < !=
		System.out.println(val);

		String str = "красный кирпич";
		boolean isCorrectWord = str.endsWith("кирпич") && str.charAt(2) == 'a'; // | - или  & - и
		boolean orCorrectWord = !str.endsWith("кирпич") || str.charAt(2) == 'a'; // | - или  & - и
		boolean notEqualsSecondMethod = !(val1 == val2);

		int byteTheiseSum = 10 & 9;// битовое сложение 10 = 1010  9 = 1001  & = 1000
		System.out.println(byteTheiseSum);
		boolean a = false;
		boolean b = true;
		// boolean xor = !a || b;

		System.out.println(str.length() >= 1);

		System.out.println(isDividedFor2And3(6));
		System.out.println(isDividedFor2And3(3));

		System.out.println(isNotDividedFor2And3(6));
		System.out.println(isNotDividedFor2And3(5));

	}

	static boolean isDividedFor2And3(int val) {
		return val % 2 == 0 && val % 3 == 0; // число делится на 2 и на 3
	}

	static boolean isNotDividedFor2And3(int val) {
		return val % 2 != 0 && val % 3 != 0; // число делится на 2 и на 3
	}
}
