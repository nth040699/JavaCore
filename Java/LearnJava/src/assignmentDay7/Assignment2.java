package assignmentDay7;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		ArrayList<Integer> danhSach = nhapDanhSach();
		
		
		display(danhSach);
	}
	
	public static ArrayList<Integer> nhapDanhSach(){
		ArrayList<Integer> danhSach = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong phan tu");
		int N = sc.nextInt();
		for(int i = 0; i < N ; i++) {
			System.out.println("Nhap gia tri cho phan tu thu" + (i+1));
			int value = sc.nextInt();
			danhSach.add(value);
		}
		return danhSach;		
	}
	public static void display(ArrayList<Integer> danhSach) {
		System.out.println("Cac gia tri co trong danh sach : ");
		for(int value : danhSach) {
			System.out.print(value + " ");
		}
	}
}
