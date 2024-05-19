package model;

public class BankBook {
	private String maSoTk;
	private String hoTen;
	private String cmnd;
	private String diaChi;
	private String soDienThoai;
	private String ngayGuiTk;
	private String soTien;
	private String kyHan;
	private String ptTaiTuc;

	public BankBook() {

	}

	public BankBook(String maSoTk, String hoTen, String cmnd, String diaChi, String soDienThoai, String ngayGuiTk,
			String soTien, String kyHan, String ptTaiTuc) {
		this.maSoTk = maSoTk;
		this.hoTen = hoTen;
		this.cmnd = cmnd;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.ngayGuiTk = ngayGuiTk;
		this.soTien = soTien;
		this.kyHan = kyHan;
		this.ptTaiTuc = ptTaiTuc;
	}

	public String getMaSoTk() {
		return maSoTk;
	}

	public void setMaSoTk(String maSoTk) {
		this.maSoTk = maSoTk;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getNgayGuiTk() {
		return ngayGuiTk;
	}

	public void setNgayGuiTk(String ngayGuiTk) {
		this.ngayGuiTk = ngayGuiTk;
	}

	public String getSoTien() {
		return soTien;
	}

	public void setSoTien(String soTien) {
		this.soTien = soTien;
	}

	public String getKyHan() {
		return kyHan;
	}

	public void setKyHan(String kyHan) {
		this.kyHan = kyHan;
	}

	public String getPtTaiTuc() {
		return ptTaiTuc;
	}

	public void setPtTaiTuc(String ptTaiTuc) {
		this.ptTaiTuc = ptTaiTuc;
	}

	@Override
	public String toString() {
		return "BankBook [maSoTk=" + maSoTk + ", hoTen=" + hoTen + ", cmnd=" + cmnd + ", diaChi=" + diaChi
				+ ", soDienThoai=" + soDienThoai + ", ngayGuiTk=" + ngayGuiTk + ", soTien=" + soTien + ", kyHan="
				+ kyHan + ", ptTaiTuc=" + ptTaiTuc + "]";
	}
	
	
}
