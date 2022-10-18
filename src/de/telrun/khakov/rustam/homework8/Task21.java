package de.telrun.khakov.rustam.homework8;

/**
 * @author Rustam Khakov
 */
public class Task21 {
	public static void main(String[] args) {
		int first = 5;
		int second = 340;
		// 5*3 = 5+5+5;
		int res = 0;
		String sumRes = "";
		if (first > second) {
			for (int i = 0; i < second; i++) {
				res = res + first;
				if (i == 0) {
					sumRes = sumRes +first;
				} else {
					sumRes = sumRes + "+" +first;
				}
			}
		} else {
			for (int i = 0; i < first; i++) {
				res = res + second;
				if (i == 0) {
					sumRes = sumRes +second;
				} else {
					sumRes = sumRes + "+" +second;
				}			}
		}
		System.out.println(sumRes);
	}
}
