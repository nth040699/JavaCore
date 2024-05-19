package assignmentDay13;

public class Assignment2 {
	public static int caculator(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * caculator(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		int result = caculator(n);
		System.out.println(result);
	}
}
