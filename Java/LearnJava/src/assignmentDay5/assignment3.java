package assignmentDay5;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		int n = sc.nextInt();

		int number = 0;

		for (int i = 1; i < n; i++) {
			number = number * 2 + 1;
			if(i%2==0) {		
				System.out.print(-number + " ");
			}else {
				System.out.print(number + " ");
			}
		}
	}
}
