package assignmentDay13;

public class Assignment3_2 {
	public static void main(String[] args) {
		int a = 12;
		int b = 18;

		int lcm = calculateLCM(a, b);

		System.out.println("BSCNN của " + a + " và " + b + " là: " + lcm);
	}

	public static int calculateLCM(int a, int b) {
		int gcd = calculateGCD(a, b);
		return Math.abs(a * b) / gcd;
	}

	public static int calculateGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return calculateGCD(b, a % b);
		}
	}
}
