package assignmentDay7;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		ArrayList<Integer> listNum = Assignment2.nhapDanhSach();
		System.out.println("mang ban dau");
		Assignment2.display(listNum);
		System.out.println("mang sau khi xoa 1 element");
		removeElement(listNum);
		Assignment2.display(listNum);
	}

	public static void removeElement(ArrayList<Integer> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vi tri can xoa");
		int n = sc.nextInt();

		if (n < arr.size() && n >= 0) {
			arr.remove(n);
		} else {
			System.out.println("Vi tri khong ton tai");
		}
	}

}
