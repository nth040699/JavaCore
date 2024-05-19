package assignmentDay5;

import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số n: ");
		int n = scanner.nextInt();

		int number = 1;
		System.out.print(number + " ");

		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				number = number * 2 + 1;
				
			}else {
				number = number * -2 - 1;
				
			}
			System.out.print(number + " ");
		}
	}
}
