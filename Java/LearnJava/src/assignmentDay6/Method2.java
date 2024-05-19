package assignmentDay6;

import java.util.Scanner;

public class Method2 {
	public static void main(String[] args) {
		System.out.println("Nhap so luong pha tu");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = addRandNum(n);

		Method1.displayArr(arr);

		sc.close();

	}

	public static int[] addRandNum(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			double randomNum = (int) (Math.random() * n) + 1;
			arr[i] = (int) randomNum;
		}
		return arr;
	}
}
