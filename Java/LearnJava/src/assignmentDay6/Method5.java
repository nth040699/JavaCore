package assignmentDay6;

public class Method5 {
	public static void main(String[] args) {
		int[] arrA = Method1.inputArr(Method1.num());

		int[] createArrB = new int[count(arrA)];

		int[] oddArrB = getOddB(arrA, createArrB);

		Method1.displayArr(oddArrB);

	}

	public static int count(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	public static int[] getOddB(int[] arrA, int[] arrB) {
		int idx = 0;
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] % 2 != 0) {
				arrB[idx] = arrA[i];
				idx++;
			}
		}
		return arrB;
	}

}
