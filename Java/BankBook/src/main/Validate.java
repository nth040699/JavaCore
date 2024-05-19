package main;

public class Validate {
	String regex = "^STK\\d{4}$";
	String regex1 = "^09\\d{8}$";
	String regex2 = "^(1|3|6|12) Thang$";
	String regex3 = "^\\d{1,12}$";

	public boolean checkMaSoTK(String ms) {
		return ms.matches(regex);
	}

	public boolean checkSDT(String sdt) {
		return sdt.matches(regex1);
	}

	public boolean checkKyhan(String kyhan) {
		return kyhan.matches(regex2);
	}

	public boolean checkCMND(String cmnd) {
		return cmnd.matches(regex3);
	}
}
