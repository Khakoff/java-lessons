package de.telrun.khakov.rustam.classwork9;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int howMuchToWithdraw = scanner.nextInt();
		int howManyIHaveOnAcc = howMuchToWithdraw;
		int atmTryCount = 0;
		while (howManyIHaveOnAcc > 0) {
			atmTryCount++;
			int maxDivider = maxDivider(howManyIHaveOnAcc);
			howManyIHaveOnAcc -= maxDivider;
		}
		System.out.println(atmTryCount);
	}

	/// счет в банке
	// банкомат работает по такой схеме: за раз может выдать сумму, которая является делителем суммы на счету
	// сколько раз придется подойти к банкомату чтобы снять все деньги

	// 136
	// 21            1 3 7
	// 7 -> 14       1 2 7
	// 7 -> 7        1
	// 1 -> 6        1 2 3
	// 3 -> 3        1
	// 1 -> 2        1
	// 1 -> 1        1
	// 1 -> 0        0

	static int maxDivider(int number) {
		for (int i = number / 2; i > 0; i--) {
			if (number % i == 0) {
				return i;
			}
		}
		return 1;
	}
}
