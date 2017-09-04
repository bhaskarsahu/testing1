package org.sahu;

/*
 * Sorting techniques:-
 * 
 * Bubble
 * Insertion
 * selection
 * Merge
 * Quick
 * Heap
 * Counting
 * Radix
 * Bucket
 * ShellSort
 * TimSort
 * CombSort
 * Pigeonhole
 * Cycle 
 * Cocktail
 * Bitonic
 * Pancake
 * Binary insertion sort
 * Bogosort or Permutation
 * Gnome
 * Sleep 
 * Stooge sort
 * Tag
 * Tree sort
 * cartesian tree sorting
 * Odd-Even sort/Brick sort	
 */
public class Sorting1 {
	public static void main(String args[]) {
		int arr[] = { 5, 2, 7, 4, 9, 1, 34, 0 };
		int arr1[] = { 5, 2, 7, 4, 9, 1, 34, 0 };
		int arr2[] = { 5, 2, 7, 4, 9, 1, 34, 0 };
		int arr3[] = { 5, 2, 7, 4, 9, 1, 34, 0 };
		int arr4[] = { 5, 2, 7, 4, 9, 1, 34, 0 };
		System.out.println("----------Unsorted array is---------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
		// insertionSort(arr);
		// selectionSort(arr1);
		// bubbleSort(arr2);
		// bubbleSortImproved(arr3);
		shellSort(arr4);
	}

	public static void insertionSort(int arr[]) {
		System.out.println("\n----------Insertion sort is---------------");
		System.out.println("\n----------before---------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println("\n----------after---------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
	}

	public static void selectionSort(int arr[]) {
		System.out.println("\n----------Selection sort is---------------");
		System.out.println("\n----------before---------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int position = i;
			int temp = arr[position];
			for (int j = position + 1; j < arr.length; j++) {
				if (arr[position] > arr[j]) {
					position = j;
				}
			}
			arr[i] = arr[position];
			arr[position] = temp;
		}
		System.out.println("\n----------after---------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println("\n----------Bubble Sort---------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
	}

	public static void bubbleSortImproved(int arr[]) {
		boolean swapped = true;
		for (int i = arr.length - 1; (i >= 0 && swapped); i--) {
			swapped = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
		}
		System.out.println("\n----------Bubble Sort Improved---------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
	}

	public static int shellSort(int arr[]) {
		int n = arr.length;

		// Start with a big gap, then reduce the gap
		for (int gap = n / 2; gap > 0; gap /= 2) {
			System.out.println("outer gap: " + gap);
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < n; i += 1) {
				System.out.println("Inner I: " + i);
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				int temp = arr[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
					System.out.println("Inner j: " + j);
					arr[j] = arr[j - gap];
				}

				// put temp (the original a[i]) in its correct
				// location
				arr[j] = temp;
			}
		}
		System.out.println("\n----------Shell Sort Improved---------------");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
		return 0;
	}
}
