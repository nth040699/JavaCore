package assignmentDay5;

import java.util.Scanner;

public class Assignment1_2 {
	public static void main(String[] args) {
		int n = 50;

		int idx = 2;
		int flag = 3;
		for (int i = 1; i <= n / 2; i++) {
			if (idx == i) {
				System.out.print(-i * 2 + " ");
				idx += flag;
				flag++;
			}else {
				System.out.print(i * 2 + " ");
			}
			
		}

	}
}
