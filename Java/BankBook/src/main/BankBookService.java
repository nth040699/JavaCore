package main;

//import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import ConnectDB.ConnectionDB;
import model.BankBook;

public class BankBookService {

	public static int insertTK(BankBook bankBook) {
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection
						.prepareStatement("INSERT INTO BankBook VALUES (?, ?, ?, ?,?, ?, ?, ?, ?)")) {

			stm.setString(1, bankBook.getMaSoTK());
			stm.setString(2, bankBook.getHoTen());
			stm.setString(3, bankBook.getCmnd());
			stm.setString(4, bankBook.getDiaChi());
			stm.setString(5, bankBook.getSoDienThoai());
			stm.setDate(6, Date.valueOf(bankBook.getNgayGuiTk()));
			stm.setFloat(7, bankBook.getSoTien());
			stm.setString(8, bankBook.getKyHan());
			stm.setInt(9, bankBook.getpTTaiTuc());
			int result = stm.executeUpdate();

			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}

	}

	public static ArrayList<BankBook> getAll() {
		ArrayList<BankBook> list = new ArrayList<BankBook>();
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection.prepareStatement("select * from BankBook");
				ResultSet rs = stm.executeQuery();) {

			while (rs.next()) {
				BankBook bankBook = new BankBook();
				bankBook.setMaSoTK(rs.getString("MaSoTK"));
				bankBook.setHoTen(rs.getString("HoTen"));
				bankBook.setCmnd(rs.getString("CMND"));
				bankBook.setDiaChi(rs.getString("DiaChi"));
				bankBook.setSoDienThoai(rs.getString("SoDienThoai"));
				bankBook.setNgayGuiTk(LocalDate.parse(rs.getString("NgayGuiTK")));
				bankBook.setSoTien(rs.getInt("SoTien"));
				bankBook.setKyHan(rs.getString("KyHan"));
				bankBook.setpTTaiTuc(rs.getInt("PTTaiTuc"));

				list.add(bankBook);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static boolean checkId(String maSoTk) {
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection.prepareStatement("select * from BankBook where maSoTk = ?");) {
			stm.setString(1, maSoTk);
			try (ResultSet rs = stm.executeQuery();) {
				return rs.next();
			}
		} catch (SQLException e) {
			return false;
		}
	}

	public static ArrayList<BankBook> timKiemSoTietKiem(String ngayBatDau, String ngayKetThuc) {
		ArrayList<BankBook> list = new ArrayList<BankBook>();
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection
						.prepareStatement("SELECT * From BankBook Where NgayGuiTK between ? and ?")) {
			stm.setString(1, ngayBatDau);
			stm.setString(2, ngayKetThuc);
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					BankBook bankBook = new BankBook();
					bankBook.setMaSoTK(rs.getString("MaSoTK"));
					bankBook.setHoTen(rs.getString("HoTen"));
					bankBook.setCmnd(rs.getString("CMND"));
					bankBook.setDiaChi(rs.getString("DiaChi"));
					bankBook.setSoDienThoai(rs.getString("SoDienThoai"));
					bankBook.setNgayGuiTk(LocalDate.parse(rs.getString("NgayGuiTK")));
					bankBook.setSoTien(rs.getInt("SoTien"));
					bankBook.setKyHan(rs.getString("KyHan"));
					bankBook.setpTTaiTuc(rs.getInt("PTTaiTuc"));

					list.add(bankBook);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static ArrayList<BankBook> timKyHanGui(String kyHan) {
		ArrayList<BankBook> list = new ArrayList<BankBook>();
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection.prepareStatement("select * from BankBook where KyHan = ?")) {
			stm.setString(1, kyHan);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				BankBook bankBook = new BankBook();
				bankBook.setMaSoTK(rs.getString("MaSoTK"));
				bankBook.setHoTen(rs.getString("HoTen"));
				bankBook.setCmnd(rs.getString("CMND"));
				bankBook.setDiaChi(rs.getString("DiaChi"));
				bankBook.setSoDienThoai(rs.getString("SoDienThoai"));
				bankBook.setNgayGuiTk(LocalDate.parse(rs.getString("NgayGuiTK")));
				bankBook.setSoTien(rs.getInt("SoTien"));
				bankBook.setKyHan(rs.getString("KyHan"));
				bankBook.setpTTaiTuc(rs.getInt("PTTaiTuc"));

				list.add(bankBook);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static int capNhatSoTietKiem(LocalDate ngayGui, float soTien, String kyHan, String maSoTk) {
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection.prepareStatement(
						"Update BankBook Set NgayGuiTK = ? , SoTien = ? , KyHan = ? Where MaSoTK = ?")) {
			stm.setDate(1, Date.valueOf(ngayGui));
			stm.setFloat(2, soTien);
			stm.setString(3, kyHan);
			stm.setString(4, maSoTk);

			int result = stm.executeUpdate();

			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1; // Trả về giá trị âm để chỉ ra rằng có lỗi xảy ra
		}
	}

	public static ArrayList<BankBook> sapXepStk() {
		ArrayList<BankBook> list = new ArrayList<BankBook>();
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection
						.prepareStatement("SELECT * From BankBook Order by SoTien ASC , NgayGuiTK DESC")) {
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				BankBook bankBook = new BankBook();
				bankBook.setMaSoTK(rs.getString("MaSoTK"));
				bankBook.setHoTen(rs.getString("HoTen"));
				bankBook.setCmnd(rs.getString("CMND"));
				bankBook.setDiaChi(rs.getString("DiaChi"));
				bankBook.setSoDienThoai(rs.getString("SoDienThoai"));
				bankBook.setNgayGuiTk(LocalDate.parse(rs.getString("NgayGuiTK")));
				bankBook.setSoTien(rs.getInt("SoTien"));
				bankBook.setKyHan(rs.getString("KyHan"));
				bankBook.setpTTaiTuc(rs.getInt("PTTaiTuc"));

				list.add(bankBook);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	public static boolean countRecord() {
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection.prepareStatement("select * from BankBook");) {
			try (ResultSet rs = stm.executeQuery();) {
				return rs.next();
			}
		} catch (SQLException e) {
			return false;
		}
	}
}
