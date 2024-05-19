package assignmentDay13;

public class Assignment5 {
	public static void reversePrint(int n) {
		if (n < 10) {
			System.out.print(n);
		} else {
			System.out.print(n % 10);
			reversePrint(n / 10);
		}
	}

	public static void main(String[] args) {
		int number = 12345;
		System.out.print("đảo ngược của số " + number + " là : ");
		reversePrint(number);
	}
}
