package org.sahu;

public class InsertionSort1 {
	public static void main(String args[]) {
		int arr[] = { 5, 2, 7, 4, 9, 1, 34, 0 };
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println("-------------------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
}
