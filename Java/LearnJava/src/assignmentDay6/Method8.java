package assignmentDay6;

import java.util.Scanner;

public class Method8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = Method1.inputArr(Method1.num());
		
		System.out.println("Nhap vi tri can xoa");
		int position = sc.nextInt();

		arr = xoaPhanTu(arr, position);

		// In mảng sau khi xóa
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

	public static int[] xoaPhanTu(int[] arr, int position) {
		// Kiểm tra vị trí có hợp lệ hay không
		if (position < 0 || position >= arr.length) {
			System.out.println("Vị trí không hợp lệ!");
			return arr; // Trả về mảng ban đầu nếu vị trí không hợp lệ
		}

		// Tạo một mảng mới có kích thước nhỏ hơn 1 so với mảng ban đầu
		int[] newArray = new int[arr.length - 1];

		// Sao chép các phần tử từ mảng ban đầu vào mảng mới trước vị trí cần xóa
		for (int i = 0; i < position; i++) {
			newArray[i] = arr[i];
		}

		// Sao chép các phần tử từ mảng ban đầu vào mảng mới sau vị trí cần xóa
		for (int i = position; i < newArray.length; i++) {
			newArray[i] = arr[i + 1];
		}

		return newArray;
	}

}
