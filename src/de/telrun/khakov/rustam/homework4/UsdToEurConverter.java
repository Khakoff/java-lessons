package de.telrun.khakov.rustam.homework4;

/**
 * @author Rustam Khakov
 */
public class UsdToEurConverter {
	double rate = 1.00;

	public UsdToEurConverter(double rate) {
		this.rate = rate;
	}

	double toDollar(double euro) {
		return rate * euro;
	}

	double toEur(double usd) {
		return usd / rate;
	}

	public static void main(String[] args) {
		UsdToEurConverter usdToEurConverter = new UsdToEurConverter(0.98);
		System.out.println(usdToEurConverter.toEur(100));
		System.out.println(usdToEurConverter.toDollar(100));
		System.out.println(customFunc("Мама Мыла Раму", 8, 3));

	}

	static char customFunc(String str, int cutFrom, int symbolIndex) {
		String substring = str.substring(cutFrom);
		return substring.charAt(symbolIndex);
	}
}
