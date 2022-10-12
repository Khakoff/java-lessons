package de.telrun.khakov.rustam.homework6;

/**
 * @author Rustam Khakov
 */
public class Parking {
	public static void main(String[] args) {

		boolean isWeekend = false;
		boolean isLorry = true;
		int carNumber = 1;
		//заплняются
		if (isLorry ) {
			if (!isWeekend) {
				if (carNumber ==1) {

				}
			}
		}

		if (isLorry) {

		} else if(isWeekend) {

		}

		// isWeekend && !isLorry && carNumber %2 ==0 || !isWeekend && !isLorry && carNumber %2 ==0

		if (isWeekend) {
			checkWeekendSystem(isLorry, carNumber);
		} else {
			checkWeekDaySystem(isLorry, carNumber);
		}
	}

	private static void checkWeekDaySystem(boolean isLorry, int carNumber) {
		if (isLorry) { //
			System.out.println("Yes");
		} else if (carNumber % 2 != 0) {
			System.out.println("Yes");
		} else {
			System.out.println("легковой авто с четными номерами");
		}
	}

	private static void checkWeekendSystem(boolean isLorry, int carNumber) {
		if (!isLorry) {
			if (carNumber % 2 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("Ne chetnoe");
			}
		} else {
			System.out.println("Lorry not accepted in weekend");
		}
	}
}
