package assignmentDay7;

import java.util.ArrayList;

public class Assignment1 {
	public static void main(String[] args) {
		ArrayList<String> listString = new ArrayList<String>();

		listString.add("Hello world");
		listString.add("Welcome");
		listString.add("nguyen thanh huy");
		
		for(String value : listString) {
			System.out.println(value);
		}
	}
}
