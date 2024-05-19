package assignmentDay8Opt2;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClassStudent {
	public static void main(String[] args) {
		Student student = new Student();
		ArrayList<Student> list = new ArrayList<>();
		list = listStudent();
		System.out.println(list);

		System.out.println("Nhung sinh vien co hoc bong la : ");
		for (Student value : list) {
			if (isScore(value)) {
				student.showInfo(value);
			}
		}
	}

	public static boolean isScore(Student student) {
		double score = student.getAverageScore();
		if (score >= 8) {
			return true;
		} else {
			return false;
		}
	}

	public static ArrayList<Student> listStudent() {
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong hoc sinh");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Student student = new Student();
			student.inputInfo();
			list.add(student);
		}
		return list;
	}
}
