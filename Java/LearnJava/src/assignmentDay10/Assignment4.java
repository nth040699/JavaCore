package assignmentDay10;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		ArrayList<Integer> num = Assignment1.createArr();
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so nguyen X");
		int x = sc.nextInt();
		System.out.println("Nhap so nguyen Y");
		int y = sc.nextInt();

		int count = countElementInRange(num, x, y);
		printMessage(count, x, y);

	}

	public static int countElementInRange(ArrayList<Integer> arr, int x, int y) {
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > x && arr.get(i) < y) {
				count++;
			}
		}
		if (count == 0) {
			return -1;
		} else {
			return count;
		}
	}

	public static void printMessage(int count, int x, int y) {
		if (count == -1) {
			System.out.println("Không có phần tử nằm trong khoảng [" + x + ", " + y + "] trong mảng.");
		} else {
			System.out.println("Có " + count + " phần tử nằm trong khoảng [" + x + ", " + y + "] trong mảng.");
		}
	}
}
