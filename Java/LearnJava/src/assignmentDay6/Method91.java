package assignmentDay6;

public class Method91 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; // Mảng số nguyên A đã cho trước
		int[] positions = { 1, 3, 4 }; // Mảng chứa các vị trí cần chèn
		int n = positions.length; // Số lượng giá trị cần thêm

		arr = themNhieuPhanTu(arr, positions, n);

		// In mảng sau khi thêm
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] themNhieuPhanTu(int[] arr, int[] positions, int n) {
		// Kiểm tra số lượng giá trị cần thêm
		if (n > 5 || n != positions.length) {
			System.out.println("Số lượng giá trị cần thêm không hợp lệ!");
			return arr; // Trả về mảng ban đầu nếu số lượng không hợp lệ
		}

		// Tạo một mảng mới có kích thước lớn hơn ban đầu
		int[] newArray = new int[arr.length + n];

		// Sao chép các phần tử từ mảng ban đầu vào mảng mới
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}

		// Chèn giá trị vào các vị trí đã xác định
		for (int i = 0; i < n; i++) {
			int value = arr[i] * 10; // Ví dụ: giá trị cần chèn là arr[i] * 10
			int position = positions[i];

			// Kiểm tra vị trí có hợp lệ hay không
			if (position < 0 || position > newArray.length) {
				System.out.println("Vị trí không hợp lệ!");
				continue;
			}

			// Dịch chuyển các phần tử phía sau vị trí cần chèn
			for (int j = newArray.length - 1; j > position; j--) {
				newArray[j] = newArray[j - 1];
			}

			// Chèn giá trị vào vị trí cần chèn
			newArray[position] = value;
		}

		return newArray; // Trả về mảng mới sau khi thêm giá trị
	}
}