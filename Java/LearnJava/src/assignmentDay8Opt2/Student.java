package assignmentDay8Opt2;

import java.util.Scanner;

public class Student {
	private String studentCode;
	private double averageScore;
	private int age;
	private String className;

	public Student() {

	}

	public Student(String studentCode, double averageScore, int age, String className) {
		this.studentCode = studentCode;
		this.averageScore = averageScore;
		this.age = age;
		this.className = className;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", averageScore=" + averageScore + ", age=" + age
				+ ", className=" + className + "]";
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student code (8 characters):");
		String code = sc.nextLine();
		while (code.length() != 8) {
			System.out.print("Invalid student code , please enter again:");
			code = sc.nextLine();
		}
		setStudentCode(code);

		System.out.println("Enter average score(0.0 - 10.0):");
		double score = sc.nextDouble();
		while (score < 0.0 || score > 10.0) {
			System.out.print("Invalid average score , please enter again:");
			score = sc.nextDouble();
		}
		setAverageScore(score);

		System.out.println("Enter age ( age >= 18):");
		int age = sc.nextInt();
		while (age < 18) {
			System.out.print("Invalid age , please enter again:");
			age = sc.nextInt();
		}
		setAge(age);
		sc.nextLine();
		System.out.println("Enter class name (Start with 'A' or 'C'): ");
		String name = sc.nextLine();
		while (!name.startsWith("A") && !name.startsWith("C")) {
			System.out.print("Invalid class name , please enter again:");
			name = sc.nextLine();
		}
		setClassName(name);
	}

	public void showInfo(Student student) {
		System.out.println("Student Code : " + student.getStudentCode());
		System.out.println("Average Score:  " + student.getAverageScore());
		System.out.println("Age : " + student.getAge());
		System.out.println("Class Name : " + student.getClassName());
	}

	public boolean hasScholarship() {
		return averageScore >= 8.0;
	}
}
