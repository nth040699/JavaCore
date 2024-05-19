package assignmentDay9;

public class Assignment6 {
	public static void main(String[] args) {
		String a = null;
		int x;
		if (a != null) {
			x = a.indexOf("H");
		} else {
			// Xử lý khi a là null
			x = -1; // Giá trị mặc định khi không tìm thấy ký tự "H"
		}
		System.out.print(x);
	}
}
