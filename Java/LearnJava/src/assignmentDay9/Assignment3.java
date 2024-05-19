package assignmentDay9;

import java.util.ArrayList;

public class Assignment3 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hello");
		System.out.println(a.get(1));

		// trường hợp trên sẽ không ném ra lỗi NullPointerException
		// trường hợp trên sẽ ném ra lỗi IndexOutOfBoundsException
		// vì trong danh sách mảng a chỉ có 1 element tương ứng với idx = 0;
		// khi get(1) thì số 1 không hợp lệ nên ném ra lỗi IndexOutOfBoundsException
	}
}
