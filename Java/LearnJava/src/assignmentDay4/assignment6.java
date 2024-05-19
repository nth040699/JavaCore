package assignmentDay4;

import java.util.Scanner;

public class assignment6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        
        for (int i = 1; i <= n; i++) {
            int number = i * 2;
            if (number % 3 == 0) {
                number *= -1;
            }
            System.out.print(number + " ");
        }
        scanner.close();
	}
}
