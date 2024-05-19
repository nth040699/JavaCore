package assignmentDay7;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = Assignment2.nhapDanhSach();

		System.out.println("Nhap gia tri X :");
		int x = sc.nextInt();

		findElement(array, x);
		sc.close();
	}

	public static void findElement(ArrayList<Integer> arr, int x) {
		boolean findIt = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == x) {
				System.out.println("value : " + x + " duoc tim thay tai vi tri " + (i) + " trong mang");
				findIt = true;
				break;
			}
		}
		if (!findIt) {
			System.out.println("Khong co value : " + x + " trong mang");
		}
	}
}
