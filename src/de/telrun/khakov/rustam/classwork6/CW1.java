package de.telrun.khakov.rustam.classwork6;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class CW1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean hasRoof = true;
		boolean hasWall = false;
		int high = 1;
		boolean accept = accept(hasRoof, hasWall, high);
		if (accept) { //если есть крыша и есть стены и высота 14
			System.out.println("можно сдавать объект");
		} else if (!hasRoof) { //иначе если нет крыши
			System.out.println("сначала нужна крыша");
		} else if (!hasWall) { // иначе если нет стены
			System.out.println("нужна стена");
		} else if (high != 14) { // иначе
			System.out.println("проблемы с высотой");
		}

		////доп проверка
		System.out.println("доп проверка документов");

		if (hasRoof) { // есть ли крыша?
			// крыша точно есть
			if (hasWall) { // стена есть?
				System.out.println("ок"); // все хорошо
			} else { // нет стены
				System.out.println("стены нет");
			}
		} else {// крыши нет
			if (hasWall) {
				System.out.println("крыша не ок");
			} else {
				System.out.println("крыша и стены не ок");
			}
		}


	}

	static boolean accept(boolean hasRoof, boolean hasWall, int high) {
		return hasRoof && hasWall && high == 14;// есть крыша и есть стены и высота 14
	}
}
