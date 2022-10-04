package de.telrun.khakov.rustam.homework4;

/**
 * @author Rustam Khakov
 */
public class GradusConverter {

	public static void main(String[] args) {
		GradusConverter converter = new GradusConverter();
		System.out.println(converter.toCelcius(32.6));
		System.out.println(converter.toFarenheit(12.5));

	}

	double toCelcius(double farenheit) {
		return (farenheit - 32) / 1.8;
	}

	double toFarenheit(double celcius) {
		return celcius * 1.8 + 32;
	}
}
