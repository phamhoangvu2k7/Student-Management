package student_management;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Fucntion 1: input data and show informaion of student
        ArrayList<Student> list = new ArrayList<>();
        boolean ok = true;

        while (ok == true) {
            String studentID = scan.nextLine();
            String fullName = scan.nextLine();
            String dateOfBirth = scan.nextLine();
            String major = scan.nextLine();
            double gpa = Double.parseDouble(scan.nextLine());

            Student s1 = new Student(studentID, fullName, dateOfBirth, major, gpa);
            list.add(s1);

            System.out.print("Ban co muon ket thuc chuong trinh khong (Yes/No): ");
            String t = scan.nextLine().toLowerCase();
            if (t.compareTo("yes") == 0) {
                System.out.println(t + " " + ok);
                ok = false;
            }
        }

        System.out.printf("| %-10s | %-25s | %-12s | %-20s | %-5s |%n",
                "ID", "HO TEN", "NGAY SINH", "NGANH", "GPA");
        System.out.println("--------------------------------------------------------------------------------------");

        for (Student x : list) {
            x.printInfo();
        }
    }
}