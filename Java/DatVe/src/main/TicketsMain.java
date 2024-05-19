package main;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

import model.TicketsDB;

public class TicketsMain {
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
				ArrayList<TicketsDB> list = TicketService.getAll();
				for (TicketsDB ticketsDB : list) {
					System.out.println(ticketsDB);
				}
				break;
			case 2:
				findInfoByDate();
				break;
			case 3:
				break;
			case 6:
				next = false;
				System.out.println("ban da thoat chuong trinh");
				break;
			}
		}
	}

	private static void findInfoByDate() {
		LocalDate bookingDate1 = bookingDate();
		LocalDate bookingDate2 = bookingDate();

		ArrayList<TicketsDB> list = TicketService.findInfoByDate(bookingDate1, bookingDate2);

		if (list.size() == 0) {
			System.out.println("khong co so tiet kiem nao phu hop voi dieu kien");
		} else {
			for (TicketsDB ticketsDB : list) {
				System.out.println(ticketsDB);
			}
		}
	}

	private static void insert() {
		System.out.println("Thêm thông tin đặt vé");

		String ticketCode = ticketCode();
		String userName = userName();
		String phoneNum = phoneNum();
		LocalDate bookingDate = bookingDate();
		String isPay = isPay();
		String infoGame = infoGame();
		String stadiumName = stadiumName();
		String grandStand = grandStand();
		int row = row();
		int seat = seat();
		int ticketPrice = price();
		LocalDateTime timeStart = timeStart();

		TicketsDB ticket = new TicketsDB();
		ticket.setTicketCode(ticketCode);
		ticket.setUserName(userName);
		ticket.setPhoneNumber(phoneNum);
		ticket.setBookingDate(bookingDate);
		ticket.setIsPay(isPay);
		ticket.setInfoGame(infoGame);
		ticket.setStadiumName(stadiumName);
		ticket.setGrandStand(grandStand);
		ticket.setRow(row);
		ticket.setSeats(seat);
		ticket.setTicketPrice(ticketPrice);
		ticket.setTimeStart(timeStart);

		int result = TicketService.insertInfo(ticket);
		
		if (result > 0) {
			System.out.println("Them thanh cong");

		} else {
			System.out.println("them that bai");
		}
	}

	private static void getAll() {
		ArrayList<TicketsDB> list = TicketService.getAll();
		list = TicketService.getAll();

		for (TicketsDB ticketsDB : list) {
			System.out.println(ticketsDB);
		}
	}

	private static String ticketCode() {
		System.out.println("Nhập mã đặt vé");
		String ticketCode = sc.nextLine();
		return ticketCode;
	}

	private static String userName() {
		System.out.println("Nhập tên khách hàng");
		String userName = sc.nextLine();
		return userName;
	}

	private static String phoneNum() {
		System.out.println("Nhập số điện thoại");
		String phoneNum = sc.nextLine();
		return phoneNum;
	}

	private static LocalDate bookingDate() {
		System.out.print("Nhập vào ngày đặt vé (yyyy-MM-dd): ");
		String format = "yyyy-MM-dd";
		String input = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		LocalDate date = null;
		try {
			date = LocalDate.parse(input, formatter);
		} catch (DateTimeParseException e) {
			System.out.println("Nhập không hợp lệ! Hãy nhập lại chính xác và theo định dạng " + format);

			return bookingDate();
		}
		return date;
	}

	private static String isPay() {
		System.out.println("Nhập trạng thái thanh toán");
		String isPay = sc.nextLine();
		return isPay;
	}

	private static String infoGame() {
		System.out.println("Nhập thông tin trận đấu");
		String infoGame = sc.nextLine();
		return infoGame;
	}

	private static String stadiumName() {
		System.out.println("Nhập tên sân vận động");
		String stadiumName = sc.nextLine();
		return stadiumName;
	}

	private static String grandStand() {
		System.out.println("Nhập khán đài");
		String grandStand = sc.nextLine();
		return grandStand;
	}

	private static int row() {
		System.out.println("Nhập hàng ngồi");
		int row = sc.nextInt();
		return row;
	}

	public static int seat() {
		System.out.println("Nhập chỗ ngồi");
		int seat = sc.nextInt();
		return seat;
	}

	public static int price() {
		System.out.println("Nhập giá vé");
		int price = sc.nextInt();
		sc.nextLine();
		return price;
	}

	private static LocalDateTime timeStart() {
		System.out.print("Nhập thời gian trận đấu tổ chức (yyyy-MM-dd HH:mm:ss): ");
		String input = sc.nextLine();
		String format = "yyyy-MM-dd HH:mm:ss";
		LocalDateTime dateTime = null;
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			dateTime = LocalDateTime.parse(input, formatter);
		} catch (DateTimeException e) {
			System.out.println("Nhập không hợp lệ! Hãy nhập lại chính xác và theo định dạng " + format);
			return timeStart();
		}
		return dateTime;
	}

	private static void menu() {
		System.out.println("Chào mừng bạn đến với chương trình quản lý đặt vé xem bóng đá Euro 2024");
		System.out.println("Các chức năng của chương trình");

		System.out.println("1. Thêm thông tin đặt vé");
		System.out.println("2. Tìm thông tin đặt vé");
		System.out.println("3. Xóa thông tin đặt vé");
		System.out.println("4. Cập nhật giá vé");
		System.out.println("5. Sắp xếp thông tin đặt vé");
		System.out.println("6. Thoát khỏi chương trình");
	}
}
