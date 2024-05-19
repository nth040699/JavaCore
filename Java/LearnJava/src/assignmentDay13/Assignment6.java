package assignmentDay13;

public class Assignment6 {
	public static int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int number = 12345;
		int digitCount = countDigits(number);
		System.out.println("số lượng chữ số của " + number + " là " + digitCount);
	}
}
