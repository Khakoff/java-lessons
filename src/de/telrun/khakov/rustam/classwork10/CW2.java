package de.telrun.khakov.rustam.classwork10;

/**
 * @author Rustam Khakov
 */
public class CW2 {
	public static void main(String[] args) {
		//Число совершенно, если оно равно сумме всех своих делителей, кроме самого себя.
		// Пример: 6 = 1 + 2 + 3. Найдите все совершенные числа от 1 до 10000 и выведите их на экран.
		int totalCount = 0;
		int i = 1;
		while (i <= 10_000) {
			if (isNumberExcellent(i)) {
				System.out.println("совершенное число: " + i);
			}
			i++;
		}

	}

	private static boolean isNumberExcellent(int number) {
		int sumOfDividers = 0;
		int i = 1;
		while (i <= number / 2) {
			if (number % i == 0) {
				sumOfDividers += i;
			}
			if (sumOfDividers > number) {
				return false;
			}
			i++;
		}
		return sumOfDividers == number;
	}
}
