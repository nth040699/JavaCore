package Test;

import java.util.Scanner;

public class Student {
	private String studentID;
	private double averageScore;
	private int age;
	private String className;

	public Student() {
	}

	public Student(String studentID, double averageScore, int age, String className) {
		this.studentID = studentID;
		this.averageScore = averageScore;
		this.age = age;
		this.className = className;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
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

	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student ID (8 characters): ");
		String id = scanner.nextLine();
		while (id.length() != 8) {
			System.out.print("Invalid student ID. Please enter again: ");
			id = scanner.nextLine();
		}
		setStudentID(id);

		System.out.print("Enter average score (0.0 - 10.0): ");
		double score = scanner.nextDouble();
		while (score < 0.0 || score > 10.0) {
			System.out.print("Invalid average score. Please enter again: ");
			score = scanner.nextDouble();
		}
		setAverageScore(score);

		System.out.print("Enter age (must be 18 or above): ");
		int studentAge = scanner.nextInt();
		while (studentAge < 18) {
			System.out.print("Invalid age. Please enter again: ");
			studentAge = scanner.nextInt();
		}
		setAge(studentAge);

		scanner.nextLine(); // Consume the remaining newline character

		System.out.print("Enter class name (start with 'A' or 'C'): ");
		String name = scanner.nextLine();
		while (!name.startsWith("A") && !name.startsWith("C")) {
			System.out.print("Invalid class name. Please enter again: ");
			name = scanner.nextLine();
		}
		setClassName(name);
	}

	public void showInfo() {
		System.out.println("Student ID: " + studentID);
		System.out.println("Average score: " + averageScore);
		System.out.println("Age: " + age);
		System.out.println("Class name: " + className);
	}

	public boolean hasScholarship() {
		return averageScore >= 8.0;
	}
}
