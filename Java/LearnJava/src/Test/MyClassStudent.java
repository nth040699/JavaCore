package Test;

public class MyClassStudent {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.inputInfo();

		Student student2 = new Student("S1234567", 9.5, 20, "A123");

		Student student3 = new Student();
		student3.setStudentID("S7654321");
		student3.setAverageScore(7.8);
		student3.setAge(19);
		student3.setClassName("C456");

		System.out.println("Students with scholarships:");
		if (student1.hasScholarship()) {
			student1.showInfo();
		}
		if (student2.hasScholarship()) {
			student2.showInfo();
		}
		if (student3.hasScholarship()) {
			student3.showInfo();
		}
	}
}
