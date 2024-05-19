package assignmentDay7;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> danhSach = Assignment2.nhapDanhSach();
		System.out.println("Danh sach trc khi update");
		Assignment2.display(danhSach);
		update(danhSach);
		Assignment2.display(danhSach);
		
	}
	public static void update(ArrayList<Integer> danhSach) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap vi tri can update");
		int viTri = sc.nextInt();
		System.out.println("Nhap gia tri can update");
		int value = sc.nextInt();

		if(viTri < danhSach.size() && viTri >=0 ) {
			danhSach.set(viTri, value);
		}else {
			System.out.println("Vi tri khong hop le");
		}
	}
}
