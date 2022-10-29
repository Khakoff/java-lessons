package de.telrun.khakov.rustam.classwork12;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class ArraySort {


	public static void main(String[] args) {
		int[] first = {1, 2, 2, 5, 7, 9, 14, 56, 78};
		int[] second = {1, 4, 5, 6, 8, 26, 66, 98};
		int[] result = new int[first.length + second.length];
		int firstId = 0;
		int secondId = 0;
		int resultIndex = 0;
//		while (firstId < first.length || secondId < second.length) {
//			if (firstId == first.length || first[firstId] >= second[secondId]) {
//				result[resultIndex] = second[secondId];
//				secondId++;
//			} else {
//				result[resultIndex] = first[firstId];
//				firstId++;
//			}
//			resultIndex++;
//		}
//		System.out.println(Arrays.toString(result));

		for (int i = 0; i < first.length; i++) {
			result[i] = first[i];
		}
		for (int i = 0; i < second.length; i++) {
			result[i + first.length] = second[i];
		}


		for (int i = 0; i < result.length; i++) {
			int max = result[0];
			int maxIndex = 0;
			for (int j = 0; j < result.length - i; j++) {
				if (result[j] > max){
					max = result[j];
					maxIndex = j;
				}
			}
			int swapVal = result[result.length - i -1];
			result[result.length - i -1] = result[maxIndex];
			result[maxIndex] = swapVal;
		}
		System.out.println(Arrays.toString(result));

		//test
		int[] arr = {1,56,34,3,12,78,45,34,23,56,89,56,1,4};
		System.out.println(Arrays.toString(sortArray(arr)));
	}

	public static int[] sortArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int max = arr[0];
			int maxIndex = 0;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > max){
					max = arr[j];
					maxIndex = j;
				}
			}
			int swapVal = arr[arr.length - i -1];
			arr[arr.length - i -1] = arr[maxIndex];
			arr[maxIndex] = swapVal;
		}
		return arr;
	}
}
