package assignmentDay9;

public class Assignment5 {
	public static void main(String[] args) {
		// Đoạn code sau có throw NullPointerException hay không? Vì sao?
		String a = null;
		a = a + "Hello";
		System.out.println(a);
		// không ném ra lỗi NullPointerException
		// đoạn code trên đang thực hiện việc nối chuỗi
		// System.out.println(a); => nullHello;

	}
}
