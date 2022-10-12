package de.telrun.khakov.rustam.homework6;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class CarControlSystem {
	public static void main(String[] args) {
		Random random = new Random();
		int carNumber = random.nextInt(10_000) + 1; // 1- 10_000
		boolean isLorry = random.nextBoolean();
		if (carNumber >10_000 || carNumber <=0) {
			System.out.println("невалидный номер");
			return;
		}
		///if ....
		// не грузовик и номер машины четный
		// !isLorry && carNumber %2 ==0
	}
}
