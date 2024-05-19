package assignmentDay9;

import java.util.ArrayList;

public class Assignment4 {
	public static void main(String[] args) {
		//ArrayList<SinhVien> a = new ArrayList<SinhVien>();
		//SinhVien sv;
		//a.add(sv);
		//SinhVien svout = a.get(0);
		//System.out.println(svout.getHoTen());

		// biến sv được khai báo nhưng không được khởi tạo , khi a.add(sv) thì đang thêm
		// 1 tham chiếu null vào danh sách
		// khi gọi a.get(0) tức là đang tham chiếu đến đối tượng null
		// khi gọi System.out.println(svout.getHoTen()) nó sẽ cố gắng truy cập phương
		// thức getHoTen() trên một tham chiếu đối tượng null, khi đó ném ra
		// NullPointerException
	}
}
