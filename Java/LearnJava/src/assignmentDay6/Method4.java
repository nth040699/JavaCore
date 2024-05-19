package assignmentDay6;

public class Method4 {
	public static void main(String[] args) {
		int[] arrA = Method1.inputArr(Method1.num());

		int[] createArrB = new int[count(arrA)];

		int[] evenArrB = getEvenB(arrA, createArrB);

		Method1.displayArr(evenArrB);
	}

	/**
	 * dem so luong gia tri chan co trong mangA
	 * 
	 * @param arr : mang A
	 * @return so luong so chan
	 */
	public static int count(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	// hàm lấy ra số chẵn từ mảng A và gắn vào mảng B
	public static int[] getEvenB(int[] arrA, int[] arrB) {
		// Khởi tạo idx để gắn từng số chẵn của mảng A vào mảng B
		int idx = 0;
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] % 2 == 0) {
				arrB[idx] = arrA[i];
				idx++;
			}
		}
		return arrB;
	}

}
