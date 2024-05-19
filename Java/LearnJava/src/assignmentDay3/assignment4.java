package assignmentDay3;

import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		
		int quantity;
		float price , total;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sản phẩm");
		quantity = sc.nextInt();
		System.out.println("Nhập đơn giá sản phẩm");
		price = sc.nextFloat();
		
		
		if(quantity > 120) {
			total = quantity*price - (quantity*price)*15/100;
			System.out.println(total);
		}else if(quantity >= 100) {
			total = quantity*price - (quantity*price)*10/100;
			System.out.println(total);
		}else {
			total = quantity*price;
			System.out.println(total);
		}
		sc.close();
	}
}
