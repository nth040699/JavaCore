package assignmentDay8Otp1;

import java.util.Scanner;

public class Sale {
	private String name;
	private int age;
	private String address;
	private double salary;
	private int sumTimeWork;

	public static int saleCount = 0;

	public Sale() {

	}

	@Override
	public String toString() {
		return "Sale [name=" + name + ", age=" + age + ", address=" + address + ", salary=" + salary + ", sumTimeWork="
				+ sumTimeWork + "]";
	}

	public Sale(String name, int age, String address, double salary, int sumTimeWork) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.sumTimeWork = sumTimeWork;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSumTimeWork() {
		return sumTimeWork;
	}

	public void setSumTimeWork(int sumTimeWork) {
		this.sumTimeWork = sumTimeWork;
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ten nhan vien sale: ");
		String name = sc.nextLine();
		setName(name);
		System.out.println("Nhap tuoi nhan vien sale:");
		int age = sc.nextInt();
		setAge(age);
		System.out.println("Nhap dia chi nhan vien sale:");
		String address = sc.nextLine();
		sc.nextLine();
		setAddress(address);
		System.out.println("Nhap luong nhan vien : ");
		double salary = sc.nextDouble();
		setSalary(salary);
		System.out.println("Nhap tong so gio lam:");
		int sumTimeWork = sc.nextInt();
		setSumTimeWork(sumTimeWork);
	}

	public void printInfo(Sale sale) {
		System.out.println("Ten nhan vien: " + sale.getName());
		System.out.println("Tuoi nhan vien: " + sale.getAge());
		System.out.println("Dia chi nhan vien: " + sale.getAddress());
		System.out.println("Luong nhan vien: " + sale.getSalary());
		System.out.println("Tong gio lam cua nhan vien: " + sale.getSumTimeWork());
	}

	public double getBouns(int sumTime) {
		if (sumTime < 100) {
			return 0;
		} else if (sumTime >= 100 && sumTime < 200) {
			return salary * 10 / 100;
		} else {
			return salary * 20 / 100;
		}
	}
}
