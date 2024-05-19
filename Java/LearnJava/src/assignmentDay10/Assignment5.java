package assignmentDay10;

public class Assignment5 {
	public static void main(String[] args) {
		// Mảng số nguyên dương A
		int[] A = { 0, 1, 2, 4, 6, 9, 11, 15 };

		// Gọi hàm tìm giá trị nhỏ nhất còn thiếu
		int missingValue = findMissingValue(A);

		// Hiển thị kết quả
		System.out.println("Giá trị nhỏ nhất còn thiếu trong mảng: " + missingValue);
	}

	public static int findMissingValue(int[] A) {
		int left = 0;
		int right = A.length - 1;

		// Kiểm tra trường hợp đặc biệt mảng rỗng
		if (A[left] != 0) {
			return 0;
		}

		// Kiểm tra trường hợp đặc biệt mảng không chứa số 0
		if (A[right] == right + 1) {
			return right + 1;
		}

		// Tìm giá trị nhỏ nhất còn thiếu sử dụng tìm kiếm nhị phân
		while (left < right) {
			int mid = (left + right) / 2;
			if (A[mid] == mid) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		return left;
	}
}
