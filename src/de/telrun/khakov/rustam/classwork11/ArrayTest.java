package de.telrun.khakov.rustam.classwork11;

/**
 * @author Rustam Khakov
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] array = new int[10];
		//int 32 bit -> 4 byte -> 000001010
		// 160 SMS - > char[] sms1 = new char[160];
		// 160 SMS - > char[] sms1 = new char[160];

		int[] documents = {12, 34, 65, 22, 0};
		// int[] documents = new int[4]
		//documents[0] = 12;
		//documents[1] = 34;
		//documents[2] = 65;
		//documents[3] = 22;
//		for (int i = 0; i < documents.length; i++) {
//			System.out.println(documents[i]);
//		}

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = 1;
			} else {
				array[i] = 2;
			}
			System.out.println("index: "+ i + ", val: " + array[i]);
		}

		String[] pocketThings = {"ключи", "брелок", null};
		pocketThings[2] = "печенье";
		for (int i = 0; i < pocketThings.length; i++) {
			System.out.println(pocketThings[i]);
		}


	}
}
