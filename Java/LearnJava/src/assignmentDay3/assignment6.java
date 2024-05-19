package assignmentDay3;

import java.util.Scanner;

public class assignment6 {
	public static void main(String[] args) {
		String answer;
		Scanner sc = new Scanner(System.in);

		System.out.println("Hãy nhập đáp án của bạn");
		answer = sc.nextLine();
		
		switch(answer) {
		case "a":
			System.out.println("int 1x = 10");
			break;
		case "b":
			System.out.println("int x = 10");
			break;
		case "c":
			System.out.println("float x = 10.0f");
			break;
		case "d":
			System.err.println("chuỗi x = \"10\"");
			break;
			default:
				System.out.println("Chỉ có đáp án a hoặc b hoặc c hoặc d");
				break;
		}

	}
}
