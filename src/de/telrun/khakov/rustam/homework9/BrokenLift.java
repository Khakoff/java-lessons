package de.telrun.khakov.rustam.homework9;

/**
 * @author Rustam Khakov
 */
public class BrokenLift {

	//сломанный лифт
	//лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
	// Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил
	// колличество этажей, то считается что лифт поднялся на самый верх. Найдите количество подьемов,
	// которые понадобятся лифту.
	public static void main(String[] args) {
		int h = 100;
		int n = 50;
		int m = 1;
		int count = 0;
		int current = 1;
		while (current< h) {
			count++;
			current += n-m;

		}
		System.out.println(count);
	}

}
