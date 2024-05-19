package assignmentDay10;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = Assignment1.createArr();
		int value = countX(num);
		System.out.println(value);

	}

	public static int countX(ArrayList<Integer> arr) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri x can tim");
		int x = sc.nextInt();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == x) {
				count++;
			}
		}
		if (count == 0) {
			return -1;
		} else {
			return count;
		}
	}
}
