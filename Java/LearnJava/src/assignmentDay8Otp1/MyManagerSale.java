package assignmentDay8Otp1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyManagerSale {
	public static void main(String[] args) {

		ArrayList<Sale> listSale = new ArrayList<>();
		listSale = listSale();
		displaySale(listSale);
		displayBonusSales(listSale);
	}

	public static ArrayList<Sale> listSale() {
		ArrayList<Sale> list = new ArrayList<>();
		System.out.println("Nhap so luong nhan vien sale can them");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Sale sale = new Sale();
			sale.inputInfo();
			list.add(sale);
		}
		return list;
	}

	public static void displaySale(ArrayList<Sale> listSale) {
		for (Sale sale : listSale) {
			System.out.println(sale);
		}
	}

	public static void displayBonusSales(ArrayList<Sale> listSale) {
		for (Sale sale : listSale) {
			System.out.println(sale.getName() + " co so tien thuong la : " + sale.getBouns(sale.getSumTimeWork()));
		}
	}
}
