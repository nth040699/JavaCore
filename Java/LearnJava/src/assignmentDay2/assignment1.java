package assignmentDay2;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println("Nhap so nguyen a");
		a = sc.nextInt();
		System.out.println("Nhap so nguyen b");
		b = sc.nextInt();
		
		int add = a + b;
		int sub = a - b;
		int multi = a*b;
		float division = a/b;
		
		System.out.println("a + b = "+add);
		System.out.println("a - b = "+sub);
		System.out.println("a * b = "+multi);
		System.out.println("a / b = "+division);
	}
}
