package assignmentDay7;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		ArrayList<Integer> danhSach = Assignment2.nhapDanhSach();
		Assignment2.display(danhSach);

		int value = giaTriTaiViTri(danhSach);
		if (value == -1) {
			System.out.println("Khong tim thay gia tri");
		} else {
			System.out.println(value);
		}

	}

	public static int giaTriTaiViTri(ArrayList<Integer> danhSach) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap vi tri");
		int viTri = sc.nextInt();
		int value = 0;
		if (viTri < danhSach.size() && viTri >= 0) {
			for (int i = 0; i < danhSach.size(); i++) {
				if (viTri == i) {
					value = danhSach.get(i);
				}
			}
		} else {
			return -1;
		}

		return value;
	}
}
