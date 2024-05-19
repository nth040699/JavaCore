package assignmentDay5;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n");
		int n = sc.nextInt();

		int first = 1;
		int second = 2;

		System.out.print(first + " " + second + " ");

		for (int i = 3; i <= n; i++) {
			int next = first + second;
			System.out.print(next + " ");

			first = second;
			second = next;
		}
		sc.close();
	}
}
