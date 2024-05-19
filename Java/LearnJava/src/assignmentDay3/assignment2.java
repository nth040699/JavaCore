package assignmentDay3;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Nhập một giá trị bất kỳ");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Số "+ num + " là số chẵn");
		}else {
			System.out.println("Số "+ num + " là số lẻ");
		}
	}
}
