package assignmentDay7;

import java.util.ArrayList;

public class Assignment7 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = Assignment2.nhapDanhSach();
		ArrayList<Integer> arr2 = Assignment2.nhapDanhSach();
		soSanhMang(arr1, arr2);
	}

	public static void soSanhMang(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		if (arr1.size() != arr2.size()) {
			System.out.println("2 mang khong giong nhau");
		}
		boolean soSanh = true;

		for (int i = 0; i < arr1.size(); i++) {
			boolean kq = false;
			for (int j = 0; j < arr2.size(); j++) {
				if (arr1.get(i) == arr2.get(j)) {
					kq = true;
				}
			}
			if (!kq) {
				soSanh = false;
				break;
			}
		}
		for (int i = 0; i < arr1.size(); i++) {
			boolean kq = false;
			for (int j = 0; j < arr2.size(); j++) {
				if (arr2.get(i) == arr1.get(j)) {
					kq = true;
				}
			}
			if (!kq) {
				soSanh = false;
				break;
			}
		}

		if (!soSanh) {
			System.out.println("2 mang khong giong nhau");
		}

		if (soSanh) {
			System.out.println("2 mang giong nhau");
		}
	}
}
