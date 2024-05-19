package assignmentDay10;

public class Assignment6 {
	public static void main(String[] args) {
		// Mảng đã được sắp xếp
		int[] arr = { 15, 20, 25, 30, 31, 44, 66 };

		// Phần tử cần tìm
		int x = 25;

		// Gọi hàm tìm vị trí của phần tử
		int position = findElementPosition(arr, x);

		if (position != -1) {
			System.out.println("Vị trí của phần tử " + x + " trong mảng: " + position);
		} else {
			System.out.println("Phần tử " + x + " không tồn tại trong mảng.");
		}
	}

	public static int findElementPosition(int[] arr, int x) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		// Trường hợp không tìm thấy
		return -1;
	}
}
