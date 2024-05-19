package assignmentDay6;

public class Method6 {
	public static void main(String[] args) {

		int[] arr = Method1.inputArr(Method1.num());

		int[] createEvenArr = new int[Method4.count(arr)];

		int[] createOddArr = new int[Method5.count(arr)];

		int[] evenArr = Method4.getEvenB(arr, createEvenArr);

		int[] oddArr = Method5.getOddB(arr, createOddArr);

		int totalEvenArr = totalInt(evenArr);
		int totalOddArr = totalInt(oddArr);
		System.out.println("Tong cua mang chua cac gia tri chan la : " + totalEvenArr);
		System.out.println("Tong cua mang chua cac gia tri le la : " + totalOddArr);

	}

	public static int totalInt(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}
