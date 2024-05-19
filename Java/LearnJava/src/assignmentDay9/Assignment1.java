package assignmentDay9;

public class Assignment1 {
	public static void main(String[] args) {
		// Khi nào thì xảy ra NullPointerException?
		// xảy ra khi tham chiếu đến một đối tượng có giá trị null
		String str = null;
		int length = str.length();// NullPointerException

		int[] arr = null;
		int element = arr[0];// NullPointerException
	}
}
