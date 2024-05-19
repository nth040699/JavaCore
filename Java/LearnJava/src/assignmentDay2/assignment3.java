package assignmentDay2;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap gia tri thu nhat");
		float a = sc.nextFloat();
		System.out.println("Nhap gia tri thu hai");
		float b = sc.nextFloat();
		float sum = a + b;
		System.out.println("Tong 2 gia tri la : " +sum);
		sc.close();
	}
}
