package de.telrun.khakov.rustam.homework4;

/**
 * @author Rustam Khakov
 */
public class HWEasy {
	public static void main(String[] args) {
		HWEasy hwEasy = new HWEasy();
		double extraCalories = hwEasy.calcCaloriesDifference(20, 25, 40);
		System.out.println(hwEasy.calcSum("123", "321"));
	}

	int main(int first, int second) {
		return 1;
	}

	int sum3val(int first, int second, int third) {
		return first + second + third;
	}

	void main(double first, int second) {

	}

	double calcCaloriesDifference(int pizzaRadius, int pizzeRadius2,  int calories) {
		return calcCalories(pizzaRadius, calories) - calcCalories(pizzeRadius2, calories);
	}

	double calcCalories(int pizzaRadius, int calories) {
		return calories * Math.PI * pizzaRadius * pizzaRadius;
	}

	int calcSum(String first, String second) {
		return Integer.parseInt(first) + Integer.parseInt(second);
	}

}
