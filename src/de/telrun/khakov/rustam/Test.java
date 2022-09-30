package de.telrun.khakov.rustam;

/**
 * @author Rustam Khakov
 */
public class Test {
	public static void main(String[] args) {
		int a = 1000;
		int b = 500;
		int discount = 100;
		System.out.println("скидка " + discount);
		int priceWithDiscount = a + b - discount;
		System.out.println("стоимость со скидкой " + priceWithDiscount);
	}
}
