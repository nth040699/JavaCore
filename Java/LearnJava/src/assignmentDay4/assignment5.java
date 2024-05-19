package assignmentDay4;

import java.util.Scanner;

public class assignment5 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap n");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int number = i * 2;
			if (i % 2 == 0) {
				number *= -1;
			}
			System.out.print(number + " ");
		}
	}
}
