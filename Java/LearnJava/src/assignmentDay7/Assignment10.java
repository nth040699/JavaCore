package assignmentDay7;

import java.util.ArrayList;

public class Assignment10 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = Assignment2.nhapDanhSach();
		ArrayList<Integer> arr2 = Assignment2.nhapDanhSach();

		ArrayList<Integer> newArray = getElement(arr1, arr2);
		System.out.println("Cac phan tu khong co trong mang la");
		dsArray(newArray);
	}

	public static ArrayList<Integer> getElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (int i = 0; i < arr2.size(); i++) {
			int value = arr2.get(i);
			boolean isExist = false;
			for (int j = 0; j < arr1.size(); j++) {
				if (value == arr1.get(j)) {
					isExist = true;
					break;
				}
			}
			if (isExist) {
				newArray.add(value);
			}
		}
		return newArray;
	}

	public static void dsArray(ArrayList<Integer> danhSach) {
		for (int i = 0; i < danhSach.size(); i++) {
			System.out.println(danhSach.get(i));
		}
	}
}
