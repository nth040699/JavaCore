package assignmentDay6;

import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Nhập mảng số nguyên A
		int[] arr = Method1.inputArr(Method1.num());
		
		//Nhập các vị trí
		int[] position = Method1.inputArr(Method1.num());
		
		//Số lượng phần tử cần thêm vào mảng
		int quantityE = position.length;
		
		int[] currentArray = addNumE(arr, position, quantityE);
		Method1.displayArr(currentArray);
	}
	
	public static int[] addNumE(int[] arr , int[] positions , int quantity ) {
		if(quantity > arr.length) {
			System.err.println("So luong gia tri can them khong hop le");
		}
		
		//tạo mảng mới có size lớn hơn mảng ban đầu
		int[] newArray = new int[arr.length + quantity];
		
		//coppy các phẩn tử mảng ban đầu sang mảng mới
		for(int i = 0 ; i < arr.length ; i++) {
			newArray[i] = arr[i];
		}
		
		//Nhập giá trị cần thêm từ bàn phím và chèn vào vị trí đã xác định
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < arr.length ; i++) {
			System.out.print("Nhập giá trị cần thêm: ");
            int value = scanner.nextInt();
            System.out.print("Nhập vị trí cần chèn: ");
            int position = scanner.nextInt();

            // Kiểm tra vị trí có hợp lệ hay không
            if (position < 0 || position > newArray.length) {
                System.out.println("Vị trí không hợp lệ!");
                continue;
            }

            // Dịch chuyển các phần tử phía sau vị trí cần chèn
            for (int j = newArray.length - 1; j > position; j--) {
                newArray[j] = newArray[j - 1];
            }

            // Chèn giá trị vào vị trí cần chèn
            newArray[position] = value;
		}
		return newArray;
	}
	
}
