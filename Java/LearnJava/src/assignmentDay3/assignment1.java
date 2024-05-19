package assignmentDay3;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tuoi");
		age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Bạn đủ điều kiện bầu cử");
		}else {
			System.out.println("Bạn không đủ điều kiện bầu cử");
		}
		
	}
}
