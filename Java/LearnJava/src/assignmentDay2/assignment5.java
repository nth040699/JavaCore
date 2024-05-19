package assignmentDay2;

import java.util.Scanner;

public class assignment5 {
	public static void main(String[] args) {
		final float PI = 3.14f;
		float r,d,C,S;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ban kinh duong tron:");
		r = sc.nextFloat();
		d = 2*r;
		C = d*PI;
		S = (C*C)/(4*PI);
		System.out.println("Chu vi hinh tron la : "+C);
		System.out.println("Dien tich hinh tron la : "+S);
	}
}
