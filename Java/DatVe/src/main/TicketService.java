package main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import Connection.ConnectionDB;
import model.TicketsDB;

public class TicketService {
	private static final String GET_ALL = "select * from DatVeBongDa";
	private static final String INSERT_INFO = "INSERT INTO DatVeBongDa  VALUES (?, ?, ?, ?,?, ?, ?, ?, ?,?,?,?)";
	private static final String FIND_BY_DATE = "select * from DatVeBongDa where NgayDatVe <= ? AND NgayDatVe >= ?";

	public static ArrayList<TicketsDB> getAll() {

		ArrayList<TicketsDB> list = new ArrayList<TicketsDB>();
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection.prepareStatement(GET_ALL);
				ResultSet rs = stm.executeQuery();) {
			while (rs.next()) {
				TicketsDB ticket = new TicketsDB();
				ticket.setTicketCode(rs.getString("MaDatVe"));
				ticket.setUserName(rs.getString("TenKhachHang"));
				ticket.setPhoneNumber(rs.getString("SoDienThoai"));
				ticket.setIsPay(rs.getString("TTThanhToan"));
				ticket.setInfoGame(rs.getString("TTTranDau"));
				ticket.setStadiumName(rs.getString("SanVanDong"));
				ticket.setGrandStand(rs.getString("KhanDai"));
				ticket.setRow(rs.getInt("HangGhe"));
				ticket.setSeats(rs.getInt("ChoNgoi"));
				ticket.setTicketPrice(rs.getInt("GiaVe"));
				ticket.setBookingDate(rs.getDate("NgayDatVe").toLocalDate());
				ticket.setTimeStart((rs.getTimestamp("TTBatDau").toLocalDateTime()));

				list.add(ticket);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static int insertInfo(TicketsDB ticket) {
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection.prepareStatement(INSERT_INFO)) {

			stm.setString(1, ticket.getTicketCode());
			stm.setString(2, ticket.getUserName());
			stm.setString(3, ticket.getPhoneNumber());
			stm.setDate(4, Date.valueOf(ticket.getBookingDate()));
			stm.setString(5, ticket.getIsPay());
			stm.setString(6, ticket.getInfoGame());
			stm.setString(7, ticket.getStadiumName());
			stm.setString(8, ticket.getGrandStand());
			stm.setInt(9, ticket.getRow());
			stm.setInt(10, ticket.getSeats());
			stm.setInt(11, ticket.getTicketPrice());
			stm.setTimestamp(12, Timestamp.valueOf(ticket.getTimeStart()));
			int result = stm.executeUpdate();

			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static ArrayList<TicketsDB> findInfoByDate(LocalDate bookingDate1, LocalDate bookingDate2) {
		ArrayList<TicketsDB> list = new ArrayList<TicketsDB>();
		try (Connection connection = ConnectionDB.getConnection();
				PreparedStatement stm = connection.prepareStatement(FIND_BY_DATE)) {
			stm.setDate(1, Date.valueOf(bookingDate1));
			stm.setDate(2, Date.valueOf(bookingDate2));

			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					TicketsDB ticket = new TicketsDB();
					ticket.setTicketCode(rs.getString("MaDatVe"));
					ticket.setUserName(rs.getString("SoDienThoai"));
					ticket.setBookingDate(rs.getDate("NgayDatVe").toLocalDate());
					ticket.setIsPay(rs.getString("TTThanhToan"));
					ticket.setInfoGame(rs.getString("TTTranDau"));
					ticket.setStadiumName(rs.getString("SanVanDong"));
					ticket.setGrandStand(rs.getString("KhanDai"));
					ticket.setRow(rs.getInt("HangGhe"));
					ticket.setSeats(rs.getInt("ChoNgoi"));
					ticket.setTicketPrice(rs.getInt("GiaVe"));
					ticket.setTimeStart(rs.getTimestamp("TTBatDau").toLocalDateTime());

					list.add(ticket);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
