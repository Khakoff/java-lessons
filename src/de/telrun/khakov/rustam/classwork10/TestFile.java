package de.telrun.khakov.rustam.classwork10;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(Path.of("/Users/rustamkhakov/work/untitled4/src/de/telrun/khakov/rustam/classwork10/testdata.txt"));
		int firstVal = scanner.nextInt();
		int secondVal = scanner.nextInt();
		int maxSumVal = scanner.nextInt();
		int sum = 0;
		for (int i = firstVal; i < secondVal; i++) {
			sum += i;
			if (sum > maxSumVal) {
				System.out.println(sum);
				return;
			}
		}
	}
}
