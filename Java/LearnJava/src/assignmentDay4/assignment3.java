package assignmentDay4;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n");
		n = sc.nextInt();
		
		for(int i = 1; i <= n ;i++ ) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
