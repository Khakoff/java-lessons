package de.telrun.khakov.rustam.homework11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class HW4 {
	public static void main(String[] args) {
//		Найти в массиве самую длинную последовательность, состоящую из одинаковых элементов.
//		Вывести на экран количество элементов самой длиной последовательности и номер элемента,
//		который является ее началом.
//Например, если массив выглядит так: 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0 ,
// то количество элементов самой длинной последовательности, состоящей из одинаковых элементов, равно 5, а начинается она с 9-го элемента.

		int[] arr = new int[20];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(2);
		}
		System.out.println(Arrays.toString(arr));

		int maxLength = 1;
		int maxLengthIndex = 0;
		int candidateMax = 1;
		int candidateIndex = 0;
		/// 1 0 0 0 1 1 0 0 1 1 1 1
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				candidateMax++;
			} else {
				if (maxLength < candidateMax) {
					maxLength = candidateMax;
					maxLengthIndex = candidateIndex;
				}
				candidateMax = 1;
				candidateIndex = i;
			}
		}
		if (maxLength < candidateMax) {
			maxLength = candidateMax;
			maxLengthIndex = candidateIndex;
		}
		System.out.println(maxLengthIndex);
		System.out.println(maxLength);
	}


	public static int calcMaxLength(int maxLength, int maxCandidate) {
		return maxLength < maxCandidate ? maxCandidate : maxLength;
	}

	public static int calcMaxIndex(int maxLength, int maxCandidate, int maxLengthIndex, int candidateIndex) {
		return maxLength < maxCandidate ? candidateIndex : maxLengthIndex;
	}
}
