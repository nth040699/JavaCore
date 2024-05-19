package assignmentDay4;

import java.util.Scanner;

public class assignment7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap n");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int num = i*2;
			System.out.print(num+" ");
		}
	}
}
