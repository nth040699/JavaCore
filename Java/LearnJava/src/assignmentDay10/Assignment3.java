package assignmentDay10;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		ArrayList<Integer> num = Assignment1.createArr();
		ArrayList<Integer> arrIdx = findIdx(num);
		System.out.println(arrIdx);

	}

	public static ArrayList<Integer> findIdx(ArrayList<Integer> arr) {
		ArrayList<Integer> arrIdx = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri X can tim");
		int x = sc.nextInt();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == x) {
				arrIdx.add(i);
			}
		}

		return arrIdx;
	}
}
