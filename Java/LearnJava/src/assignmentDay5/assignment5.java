package assignmentDay5;

import java.util.Scanner;

public class assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhap n");
		int n = sc.nextInt();
		float S = 1.0f;
		for(int i = 1 ; i<=n ; i++) {
			S += 1.0/i;
		}
		System.out.println(S);
	}
}
