package assignmentDay3;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		float score;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập số ĐTB");
		score = sc.nextFloat();
		
		if(score > 90 && score <= 100) {
			System.out.println("Điểm = A");
		}else if(score >= 70 && score < 90) {
			System.out.println("Điểm = B");
		}else if(score >= 50 && score < 70) {
			System.out.println("Điểm = C");
		}else {
			System.out.println("Điểm = F");
		}
		
	}
}
