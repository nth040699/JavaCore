package model;

import java.time.LocalDate;

public class BankBook {
	private String maSoTK;
	private String cmnd;
	private String hoTen;
	private String diaChi;
	private String soDienThoai;
	private LocalDate ngayGuiTk;
	private float soTien;
	private String kyHan;
	private int pTTaiTuc;

	public BankBook() {

	}

	public BankBook(String maSoTK, String cmnd, String hoTen, String diaChi, String soDienThoai, LocalDate ngayGuiTk,
			float soTien, String kyHan, int pTTaiTuc) {
		this.maSoTK = maSoTK;
		this.cmnd = cmnd;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.ngayGuiTk = ngayGuiTk;
		this.soTien = soTien;
		this.kyHan = kyHan;
		this.pTTaiTuc = pTTaiTuc;
	}

	public String getMaSoTK() {
		return maSoTK;
	}

	public void setMaSoTK(String maSoTK) {
		this.maSoTK = maSoTK;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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

	public LocalDate getNgayGuiTk() {
		return ngayGuiTk;
	}

	public void setNgayGuiTk(LocalDate lDate) {
		this.ngayGuiTk = lDate;
	}

	public float getSoTien() {
		return soTien;
	}

	public void setSoTien(float soTien) {
		this.soTien = soTien;
	}

	public String getKyHan() {
		return kyHan;
	}

	public void setKyHan(String kyHan) {
		this.kyHan = kyHan;
	}

	public int getpTTaiTuc() {
		return pTTaiTuc;
	}

	public void setpTTaiTuc(int pTTaiTuc) {
		this.pTTaiTuc = pTTaiTuc;
	}

	@Override
	public String toString() {
		return "BankBook [maSoTK=" + maSoTK + ", cmnd=" + cmnd + ", hoTen=" + hoTen + ", diaChi=" + diaChi
				+ ", soDienThoai=" + soDienThoai + ", ngayGuiTk=" + ngayGuiTk + ", soTien=" + soTien + ", kyHan="
				+ kyHan + ", pTTaiTuc=" + pTTaiTuc + "]";
	}


	
	

}
