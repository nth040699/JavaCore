package assignmentDay3;

import java.util.Scanner;

public class assignment5 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập 1 số bất kỳ từ 0 -> 9");
		num = sc.nextInt();

		switch (num) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Số bạn nhập là : "+num);
			break;
		default :
			System.out.println("Bạn không được phép");
			break;
		}
	}
}
