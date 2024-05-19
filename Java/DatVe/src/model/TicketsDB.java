package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TicketsDB {
	private String ticketCode;
	private String userName;
	private String phoneNumber;
	private LocalDate bookingDate;
	private String isPay;
	private String infoGame;
	private String stadiumName;
	private String grandStand;
	private int row;
	private int seats;
	private int ticketPrice;
	private LocalDateTime timeStart;

	public TicketsDB() {
		super();
	}

	public TicketsDB(String ticketCode, String userName, String phoneNumber, LocalDate bookingDate, String isPay,
			String infoGame, String stadiumName, String grandStand, int row, int seats, int ticketPrice,
			LocalDateTime timeStart) {
		super();
		this.ticketCode = ticketCode;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.bookingDate = bookingDate;
		this.isPay = isPay;
		this.infoGame = infoGame;
		this.stadiumName = stadiumName;
		this.grandStand = grandStand;
		this.row = row;
		this.seats = seats;
		this.ticketPrice = ticketPrice;
		this.timeStart = timeStart;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getIsPay() {
		return isPay;
	}

	public void setIsPay(String isPay) {
		this.isPay = isPay;
	}

	public String getInfoGame() {
		return infoGame;
	}

	public void setInfoGame(String infoGame) {
		this.infoGame = infoGame;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getGrandStand() {
		return grandStand;
	}

	public void setGrandStand(String grandStand) {
		this.grandStand = grandStand;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public LocalDateTime getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(LocalDateTime timeStart) {
		this.timeStart = timeStart;
	}

	@Override
	public String toString() {
		return "TicketsDB [ticketCode=" + ticketCode + ", userName=" + userName + ", phoneNumber=" + phoneNumber
				+ ", bookingDate=" + bookingDate + ", isPay=" + isPay + ", infoGame=" + infoGame + ", stadiumName="
				+ stadiumName + ", grandStand=" + grandStand + ", row=" + row + ", seats=" + seats + ", ticketPrice="
				+ ticketPrice + ", timeStart=" + timeStart + "]";
	}

}
