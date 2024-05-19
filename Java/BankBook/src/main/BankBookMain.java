package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import model.BankBook;

public class BankBookMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean next = true;
		while (next) {
			menu();
			int option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				insert();
				ArrayList<BankBook> list = BankBookService.getAll();
				for (BankBook bankBook : list) {
					System.out.println(bankBook);
				}
				break;
			case 2:
				if (checkRecord()) {
					timKiemSoTietKiem();
				} else {
					System.out.println("Hiện tại chưa có sổ tiết kiệm nào được nhập");
				}
				break;
			case 3:
				if (checkRecord()) {
					timKyHanGui();
				} else {
					System.out.println("Hiện tại chưa có sổ tiết kiệm nào được nhập");
				}
				break;
			case 4:
				if (checkRecord()) {
					update();
				} else {
					System.out.println("Hiện tại chưa có sổ tiết kiệm nào được nhập");
				}
				break;
			case 5:
				if (checkRecord()) {
					sapXep();
				} else {
					System.out.println("Hiện tại chưa có sổ tiết kiệm nào được nhập");
				}
				break;
			case 6:
				next = false;
				System.out.println("ban da thoat chuong trinh");
				break;
			}
		}
	}

	private static void sapXep() {
		ArrayList<BankBook> array = BankBookService.sapXepStk();

		for (BankBook bankBook : array) {
			System.out.println(bankBook);
		}
	}

	private static String checkIdExist() {
		String maSoTietKiem;
		while (true) {
			System.out.println("Nhap vao ma so tiet kiem");
			maSoTietKiem = sc.nextLine();
			if (BankBookService.checkId(maSoTietKiem)) {
				break;
			} else {
				System.out.println("ma so tiet kiem khong ton tai");
			}
		}
		return maSoTietKiem;

	}

	private static void update() {
		String maSoTk = checkIdExist();

		System.out.println("Nhap so tien can cap nhat");
		float soTien = sc.nextFloat();
		sc.nextLine();
		System.out.println("Nhap ky han can cap nhat");
		String kyHan = sc.nextLine();
		System.out.println("Nhap ngay gui tiet kiem can cap nhat");
		String ngayGuiTk = sc.nextLine();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate lDate = LocalDate.parse(ngayGuiTk, format);

		int record = BankBookService.capNhatSoTietKiem(lDate, soTien, kyHan, maSoTk);

		if (record > 0) {
			System.out.println(maSoTk + " da cap nhat thanh cong");
		} else {
			System.out.println("That bai");
		}

	}

	private static void timKyHanGui() {
		Validate validate = new Validate();
		System.out.println("Nhap ky han gui");
		String kyHanGui;
		while (true) {
			kyHanGui = sc.nextLine();
			if (validate.checkKyhan(kyHanGui)) {
				break;
			} else {
				System.out.println("vui long nhap lai");
			}
		}

		ArrayList<BankBook> list = BankBookService.timKyHanGui(kyHanGui);

		if (list.size() == 0) {
			System.out.println("khong co so tiet kiem nao phu hop voi dieu kien");
		} else {
			for (BankBook bankBook : list) {
				System.out.println(bankBook);
			}
		}
	}

	private static void timKiemSoTietKiem() {

		System.out.println("Nhap ngay bat dau");
		String ngayBatDau = sc.nextLine();
		System.out.println("Nhap ngay ket thuc");
		String ngayKetThuc = sc.nextLine();

		ArrayList<BankBook> listBankBook = BankBookService.timKiemSoTietKiem(ngayBatDau, ngayKetThuc);

		if (listBankBook.size() == 0) {
			System.out.println("khong co so tiet kiem nao phu hop voi dieu kien");
		} else {
			for (BankBook bankBook : listBankBook) {
				System.out.println(bankBook);
			}
		}
	}

	private static void insert() {
		Validate validate = new Validate();
		System.out.println("Thêm thông tin sổ tiết kiệm");

		System.out.println("Nhập mã số tiết kiệm ");
		String maSoTk;
		while (true) {
			maSoTk = sc.nextLine();
			if (validate.checkMaSoTK(maSoTk)) {
				break;
			} else {
				System.out.println("Vui long nhap lai");
			}
		}

		System.out.println("Nhap ho ten");
		String hoTen = sc.nextLine();

		System.out.println("Nhap CMND");
		String cmnd;
		while (true) {
			cmnd = sc.nextLine();
			if (validate.checkCMND(cmnd)) {
				break;
			} else {
				System.out.println("Vui long nhap lai");
			}
		}
		System.out.println("Nhap dia chi");
		String diaChi = sc.nextLine();

		System.out.println("Nhap So dien thoai");
		String soDienThoai;
		while (true) {
			soDienThoai = sc.nextLine();
			if (validate.checkSDT(soDienThoai)) {
				break;
			} else {
				System.out.println("vui long nhap lai");
			}
		}

		System.out.println("Nhap Ngay gui tiet kiem");
		String ngayGuiTk = sc.nextLine();
		System.out.println("Nhap so tien");
		float soTien = Float.parseFloat(sc.nextLine());

		System.out.println("Nhap ky hang");
		String kyHan;
		while (true) {
			kyHan = sc.nextLine();
			if (validate.checkKyhan(kyHan)) {
				break;
			} else {
				System.out.println("Vui long nhap lai");
			}
		}
		System.out.println("Nhap PT tai tuc");
		int taiTuc = Integer.parseInt(sc.nextLine());
		BankBook bankBook = new BankBook();
		bankBook.setMaSoTK(maSoTk);
		bankBook.setHoTen(hoTen);
		bankBook.setCmnd(cmnd);
		bankBook.setDiaChi(diaChi);
		bankBook.setKyHan(kyHan);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate lDate = LocalDate.parse(ngayGuiTk, format);
		bankBook.setNgayGuiTk(lDate);
		bankBook.setpTTaiTuc(taiTuc);
		bankBook.setSoDienThoai(soDienThoai);
		bankBook.setSoTien(soTien);

		int result = BankBookService.insertTK(bankBook);
		if (result > 0) {
			System.out.println("Them thanh cong");

		} else {
			System.out.println("them that bai");
		}

	}

	private static boolean checkRecord() {
		boolean check = BankBookService.countRecord();
		return check;
	}

	private static void menu() {
		System.out.println("Chào mừng bạn đến với chương trình quản lý sổ tiết kiệm");
		System.out.println("Các chức năng chính của chương trình: ");
		System.out.println("1. Thêm thông tin sổ tiết kiệm");
		System.out.println("2. Tìm kiếm sổ tiết kiệm theo khoảng thời gian");
		System.out.println("3. Tìm kiếm sổ tiết kiệm theo kỳ hạn");
		System.out.println("4. Cập nhật thông tin sổ tiết kiệm ");
		System.out.println("5. Sắp xếp sổ tiết kiệm theo số tiền gửi và ngày gửi tiết kiệm");
		System.out.println("6. Thoát khỏi chương trình");
	}

}
