package de.telrun.khakov.rustam.homework8;

/**
 * @author Rustam Khakov
 */
public class Task25 {
	public static void main(String[] args) {
//		Дана строка из 6-ти цифр. Проверьте, что сумма первых трех цифр равняется сумме вторых трех цифр. Если это так - выведите 'да', в противном случае выведите 'нет'.
//в данной задаче нужно использовать 2 сумматора и дополнительно метод if чтобы проверить когда нам нужно складывать к первому сумматору, а когда ко второму

		String number = "123456";
		int sumFirstThird = 0;
		int sumSecondThird = 0;
		for (int i = 0; i < number.length(); i++) {
			int num = Character.getNumericValue(number.charAt(i));
			if (number.length() / 2 > i) {
				sumFirstThird = sumFirstThird + num;
			} else {
				sumSecondThird = sumSecondThird + num;
			}
		}
		if (sumFirstThird == sumSecondThird) {
			System.out.println("da");
		} else {
			System.out.println("nope");
		}
	}
}
