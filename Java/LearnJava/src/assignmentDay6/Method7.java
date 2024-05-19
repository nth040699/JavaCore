package assignmentDay6;

import java.util.Scanner;

public class Method7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = Method1.inputArr(Method1.num());

		System.out.println("Nhap so can them vao mang");
		int x = sc.nextInt();

		System.out.println("Nhap vi tri can them");
		int y = sc.nextInt();

		int[] newArr = addElement(arr, x, y);
		Method1.displayArr(newArr);
		sc.close();
	}

	public static int[] addElement(int[] arr, int x, int y) {
		if (y < 0 || y > arr.length) {
			System.out.println("Vi tri can them khong ton tai");
		}

		int[] newArr = new int[arr.length + 1];

		// Sao chep cac phan tu trc vi tri y
		for (int i = 0; i < y; i++) {
			newArr[i] = arr[i];
		}

		newArr[y] = x;

		// Sao chep cac phan tu sau vi tri y

		for (int i = y + 1; i < newArr.length; i++) {
			newArr[i] = arr[i - 1];
		}

		return newArr;
	}
}
