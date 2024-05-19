package assignmentDay11;

import java.util.Arrays;

public class Assignment2 {
	public static void main(String[] args) {
		int[] arr = { 3, 9, 2, 4, 7, 6, 8, 5 };
		System.out.println("Original array: " + Arrays.toString(arr));

		quickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);

			// Sắp xếp đệ quy các phần tử bên trái và bên phải của pivot
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if ((arr[j] % 2 == 0 && arr[j] <= pivot) || (arr[j] % 2 != 0 && arr[j] >= pivot)) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, high);
		return i + 1;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
