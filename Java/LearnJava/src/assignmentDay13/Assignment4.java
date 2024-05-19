package assignmentDay13;

public class Assignment4 {
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		int result = sum(n);
		System.out.println("Tổng các số từ 1 đến " + n + " là " + result);
	}
}
