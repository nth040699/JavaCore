package assignmentDay6;

import java.util.Scanner;

public class Method1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] number = inputArr(num());

		displayArr(number);

	}

	// Hàm tạo độ dài của mảng
	public static int num() {
		System.out.println("Nhap so phan tu cua mang");
		int n = sc.nextInt();
		return n;
	}

	// Hàm thêm phần tử vào trong mảng
	public static int[] inputArr(int n) {

		int[] number = new int[n];
		for (int i = 0; i < number.length; i++) {
			System.out.println("Nhap phan tu cua mang :" + i);
			number[i] = sc.nextInt();
		}
		return number;
	}

	// Hàm hiển thị các phần tử của mảng
	public static void displayArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
