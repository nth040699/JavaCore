package assignmentDay2;

import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float a, b, c, x1, x2, delta;

		System.out.println("Nhap gia tri a");
		a = sc.nextFloat();
		System.out.println("Nhap gia tri b");
		b = sc.nextFloat();
		System.out.println("Nhap gia tri c");
		c = sc.nextFloat();

		delta = b * b - 4 * a * c;

		if (a == 0) {
			System.out.println("khong phai la ptrinh bac 2");
		} else {
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				x1=x2=-b/(2*a);
				System.out.println("Phuong trinh co nghiem kep x1=x2="+x1);
			}else {
				x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
				x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			}
		}
	}
}
