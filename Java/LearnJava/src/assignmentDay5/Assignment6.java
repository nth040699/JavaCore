package assignmentDay5;

import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        scanner.close();

        double sum = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= (2 * i - 1);
            sum += 1.0 / factorial;
        }

        System.out.println("Giá trị của biểu thức S = " + sum);
    }
}
