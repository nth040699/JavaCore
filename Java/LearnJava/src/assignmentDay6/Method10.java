package assignmentDay6;

import java.util.Scanner;

public class Method10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong hoc vien");
		int n = sc.nextInt();

		String[] names = new String[n];
		double[] scoreSqlBs = new double[n];
		double[] scoreJavaBs = new double[n];
		double[] scoreJavaAdv = new double[n];

		addInfo(names, scoreSqlBs, scoreJavaBs, scoreJavaAdv);
		displayInfo(names, scoreSqlBs, scoreJavaBs, scoreJavaAdv);
		medScore(names, scoreSqlBs, scoreJavaBs, scoreJavaAdv);
		displayGoodStu(names, scoreSqlBs, scoreJavaBs, scoreJavaAdv);

	}

	public static void addInfo(String[] name, double[] sqlBs, double[] javaBs, double[] javaAdv) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < name.length; i++) {
			System.out.println("nhap ten cua sinh vien " + (i + 1));
			name[i] = sc.nextLine();
			System.out.println("Nhap diem sql basic");
			sqlBs[i] = sc.nextDouble();
			System.out.println("Nhap diem java basic");
			javaBs[i] = sc.nextDouble();
			System.out.println("Nhap diem java advanced");
			javaAdv[i] = sc.nextDouble();
			sc.nextLine();
		}
	}

	public static void displayInfo(String[] name, double[] sqlBs, double[] javaBs, double[] javaAdv) {
		for (int i = 0; i < name.length; i++) {
			System.out.println("Ten sinh vien " + (i + 1) + ": " + name[i]);
			System.out.println("diem sql : " + sqlBs[i]);
			System.out.println("diem java basic : " + javaBs[i]);
			System.out.println("diem java advanced : " + javaAdv[i]);
		}
	}

	public static void medScore(String[] name, double[] sqlBs, double[] javaBs, double[] javaAdv) {
		double[] mediumScore = new double[name.length];
		for (int i = 0; i < name.length; i++) {
			mediumScore[i] = (sqlBs[i] + javaBs[i] + javaAdv[i]) / 3;
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println("Diem trung binh cua sinh vien " + (i + 1) + ": " + mediumScore[i]);
		}
	}
	
	public static void displayGoodStu(String[] name, double[] sqlBs, double[] javaBs, double[] javaAdv) {
		System.out.println("Các học viên có điểm trung bình chung các topic >= 6.5:");
		for (int i = 0; i < name.length; i++) {
            if (sqlBs[i] >= 6.5 && javaBs[i] >= 6.5 && javaAdv[i] >= 6.5) {
                System.out.println("Học viên thứ " + (i + 1) + ": " + name[i]);
            }
        }
	}
}
