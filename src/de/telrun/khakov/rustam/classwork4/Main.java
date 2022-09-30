package de.telrun.khakov.rustam.classwork4;

import java.util.Scanner;


/**
 * @author Rustam Khakov
 */
public class Main {
	public static void main(String[] args) {
		Table bigTable = new Table(10, 1, 2, 1, "Red");
		bigTable.high = 2;

		Table smallTable = new Table(2, 1, 1,1, "Green");

		System.out.println(bigTable);

		Scanner scanner = new Scanner(System.in);
		de.telrun.khakov.rustam.classwork3.CW3 cw3 = new de.telrun.khakov.rustam.classwork3.CW3();
	}
}
