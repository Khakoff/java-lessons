package de.telrun.khakov.rustam.classwork10;

/**
 * @author Rustam Khakov
 */
public class Palindrom {

	public static void main(String[] args) {
		String palindrom = "печка";
		int length = palindrom.length();
		for (int i = 0; i < length / 2; i++) {
			char fromFirstPart = palindrom.charAt(i);
			char fromSecondPart = palindrom.charAt(length - 1 - i);
			if (fromFirstPart != fromSecondPart) {
				System.out.println("не палиндром");
				return;
			}
		}
		System.out.println("палиндром");
		String reversed = "";
		for (int i = 0; i < length ; i++) {
			reversed = palindrom.charAt(i) + reversed; // акчеп
		}
		if (palindrom.equals(reversed)) {
			System.out.println("палиндром");
		}
	}
}
