package assignmentDay11;

import java.util.Arrays;

public class Assignment1 {
	public static void main(String[] args) {
		int[] arr = { 3, 9, 2, 4, 7, 6, 8, 5 };
		System.out.println("Original array: ");
		printArray(arr);

		bubbleSort(arr);
		System.out.println("Sorted array: ");
		printArray(arr);
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if ((arr[j] % 2 == 0 && arr[j + 1] % 2 == 0 && arr[j] > arr[j + 1])
						|| (arr[j] % 2 != 0 && arr[j + 1] % 2 != 0 && arr[j] < arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
