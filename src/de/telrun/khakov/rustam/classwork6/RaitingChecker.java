package de.telrun.khakov.rustam.classwork6;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class RaitingChecker {

	public void check(int raiting) {
		System.out.println(raiting);
		if (raiting > 100) {
			System.out.println("неправильные баллы");
		} else if (raiting > 86) {
			System.out.println(5);
		} else if (raiting > 72) {
			System.out.println(4);
		} else if (raiting > 56) { // raiting <= 86 && raiting <=72
			System.out.println(3);
		} else if (raiting > 0) { ////  raiting <= 86 && raiting <=72 && raiting <= 56
			System.out.println(2);
		} else {
			System.out.println("неправильные баллы");
		}
	}

	public static void main(String[] args) {
		RaitingChecker raitingChecker = new RaitingChecker();
		Random random = new Random();
		int raiting = random.nextInt(60) + 40; /// 40 до 100
		System.out.println(random.nextDouble() * 9 + 1);
		raitingChecker.check(raiting);
		int number = random.nextInt(190);
		System.out.println(number);
		if (number % 7 == 0 && number % 5 == 0) {
			System.out.println("Делится на 7 и 5");
		}

	}
}
