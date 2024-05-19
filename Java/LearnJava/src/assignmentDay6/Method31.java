package assignmentDay6;

public class Method31 {
	public static void main(String[] args) {
		int[] arr = Method1.inputArr(Method1.num());

		displayEven(arr);

	}

	public static void displayEven(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
