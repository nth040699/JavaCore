package assignmentDay5;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số n: ");
		int n = scanner.nextInt();

		// In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n
		int flag = 1;
		int idx = 1;

		for (int i = 2; i <= n; i += 2) {

			int mul;

			if (idx > flag) {

				mul = -1;
				idx = 1;
				flag += 1;

			} else {

				mul = 1;
				idx += 1;

			}

			System.out.print(mul * i + " ");
			scanner.close();
		}
	}
}
