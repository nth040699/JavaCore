package assignmentDay5;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số m: ");
		int m = scanner.nextInt();
		scanner.close();

		int sum = 0;
		int product = 1;

		while (m != 0) {
			int digit = m % 10; // Lấy chữ số cuối cùng
			sum += digit; // Cộng chữ số vào tổng
			product *= digit; // Nhân chữ số vào tích

			m /= 10; // Loại bỏ chữ số cuối cùng
		}

		System.out.println("Tổng các chữ số của m: " + sum);
		System.out.println("Tích các chữ số của m: " + product);
	}
}
