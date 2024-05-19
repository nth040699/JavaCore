package assignmentDay10;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> num = createArr();
		boolean flag = checkX(num);
		printMessage(flag);

	}

	public static ArrayList<Integer> createArr() {
		ArrayList<Integer> num = new ArrayList<Integer>();

		System.out.println("Nhap so luong phan tu them vao");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu " + (i + 1));
			int value = sc.nextInt();
			num.add(value);
		}
		return num;
	}

	public static boolean checkX(ArrayList<Integer> arr) {
		boolean flag = false;
		System.out.println("Nhap gia tri X can tim:");
		int x = sc.nextInt();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == x) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void printMessage(boolean flag) {
		if (flag) {
			System.out.println("X ton tai trong mang");
		} else {
			System.out.println("X khong ton tai trong mang");
		}
	}

}
