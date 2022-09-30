package de.telrun.khakov.rustam.classwork4;

/**
 * @author Rustam Khakov
 */
public class Additional {

	double add(double first, double second) {
		System.out.println(" Прибавили к "+ first + " " + second);
		return first + second;//
	}

	int add(int first, int second) {
		System.out.println(" Прибавили к "+ first + " " + second);
		return first + second;
	}

	int add(int first, short second) {
		return first + second;
	}

	int add(short first, int second) {
		return first + second;
	}

	int square(int x) {
		return x * x;
	}


	public static void main(String[] args) {
		Additional additional = new Additional();
//		byte b = 1;
//		System.out.println(additional.add(b, 3)); // int
//		System.out.println(additional.add(3, 4));
//		System.out.println(additional.add(4, 5));
		int res = additional.add(3, 4);//-> add
		int res2 = additional.add(4, 5);
		System.out.println(additional.add(res, res2));
		System.out.println(additional.square(10));
		String[] val = new String[10];


	}
}
