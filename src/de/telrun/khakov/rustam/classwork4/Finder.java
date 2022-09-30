package de.telrun.khakov.rustam.classwork4;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Finder {
	String storage;

	public Finder(String storageString) {
		this.storage = storageString;
	}

	public int findIndexForString(String input) {
		return storage.indexOf(input);
	}

	public static void main(String[] args) {
		Finder finder = new Finder("Мама Мыла Раму");
		Finder secondFinder = new Finder("Мыла Мама Раму");

		Scanner scanner = new Scanner(System.in);
		String searchPhrase = scanner.next();

		int index = finder.findIndexForString(searchPhrase);
		printToConsole(1, index);
		int indexInSecondFinder = secondFinder.findIndexForString(searchPhrase);
		printToConsole(2, indexInSecondFinder);
	}


	public static void printToConsole(int numberOfLine, int index) {
		System.out.println("Индекс в "+ numberOfLine +" строке: " + index);
	}

	public void doNothing() {

	}

}
