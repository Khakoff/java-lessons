package de.telrun.khakov.rustam.classwork10;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Calc {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(Path.of("/Users/rustamkhakov/work/untitled4/src/de/telrun/khakov/rustam/classwork10/testdata2.txt"));
		Calculator calculator = new Calculator();
		String operation;
		do {
			operation = scanner.next();
			switch (operation) {
				case "+":
					System.out.println(calculator.sum(scanner.nextInt(), scanner.nextInt()));
					break;
				case "*":
					System.out.println(calculator.mult(scanner.nextInt(), scanner.nextInt()));
					break;
				case "-":
					System.out.println(calculator.minus(scanner.nextInt(), scanner.nextInt()));
					break;
				case "/":
					System.out.println(calculator.div(scanner.nextInt(), scanner.nextInt()));
					break;
				case "=":
					return;
				default:
					System.out.println("не поддерживаемая операция");

			}
		} while (!operation.equals("="));
	}
}
