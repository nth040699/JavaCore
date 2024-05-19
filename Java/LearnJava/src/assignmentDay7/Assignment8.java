package assignmentDay7;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = Assignment2.nhapDanhSach();
		
		System.out.println("Nhap gia tri X :");
		int x = sc.nextInt();
		
		int soLanXuatHien = count(array,x);
		System.out.println(soLanXuatHien);
	}
	
	public static int count(ArrayList<Integer> arr , int x) {
		int count = 0;
		for(int i = 0;i < arr.size() ; i++) {
			if(arr.get(i) == x) {
				count++;
			}
		}
		return count;
	}
}
