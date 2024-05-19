package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import connectDB.ConnectDb;
import model.BankBook;

public class BankBookDao {

	String sql = "select * from BankBook";

	public ArrayList<BankBook> getAll() {
		ArrayList<BankBook> list = new ArrayList<BankBook>();
		try (Connection conn = ConnectDb.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
		} catch (Exception e) {

		}
		return list;
	}
}
