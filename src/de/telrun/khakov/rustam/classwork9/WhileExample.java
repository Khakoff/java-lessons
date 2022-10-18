package de.telrun.khakov.rustam.classwork9;

/**
 * @author Rustam Khakov
 */
public class WhileExample {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0; // инциализируем параметр для условия
		while (i < 100) { //проверяем условие
			sum += i; //
			i++;// обновление параметра для условия
		}
		System.out.println(sum);
	}
}
