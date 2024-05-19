package assignmentDay7;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ArrayList<Integer> danhSachL1 = nhapDanhSach();
		ArrayList<Integer> danhSachL2 = nhapDanhSach();

		ArrayList<Integer> cacPhanTuKhongCoTrongL1 = layCacPhanTuKhongCoTrongL1(danhSachL1, danhSachL2);

		System.out.println("Các phần tử trong danh sách L2 không có trong danh sách L1:");
		hienThiDanhSach(cacPhanTuKhongCoTrongL1);
	}

	public static ArrayList<Integer> nhapDanhSach() {
		ArrayList<Integer> danhSach = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số lượng phần tử: ");
		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + ": ");
			int giaTri = scanner.nextInt();
			danhSach.add(giaTri);
		}

		return danhSach;
	}

	public static void hienThiDanhSach(ArrayList<Integer> danhSach) {
		for (int i = 0; i < danhSach.size(); i++) {
			System.out.println(danhSach.get(i));
		}
	}

	public static ArrayList<Integer> layCacPhanTuKhongCoTrongL1(ArrayList<Integer> danhSachL1,
			ArrayList<Integer> danhSachL2) {
		ArrayList<Integer> ketQua = new ArrayList<>();

		for (int i = 0; i < danhSachL2.size(); i++) {
			int giaTri = danhSachL2.get(i);
			boolean coTrongL1 = false;

			for (int j = 0; j < danhSachL1.size(); j++) {
				if (giaTri == danhSachL1.get(j)) {
					coTrongL1 = true;
					break;
				}
			}

			if (!coTrongL1) {
				ketQua.add(giaTri);
			}
		}

		return ketQua;
	}
}
