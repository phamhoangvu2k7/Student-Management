package student_management;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Student> list = new ArrayList<>();

    // Fucntion 1: input data and show informaion of student
    public static void inputData() {
        Scanner scan = new Scanner(System.in);
    
        boolean ok = true;
    
        while (ok == true) {
            System.out.print("Nhap ID: ");
            String studentID = scan.nextLine();
            
            System.out.print("Nhap Ten: ");
            String fullName = scan.nextLine();
            
            System.out.print("Nhap Ngay Sinh: ");
            String dateOfBirth = scan.nextLine();
            
            System.out.print("Nhap Nganh: ");
            String major = scan.nextLine();
            
            System.out.print("Nhap GPA: ");
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
    }

    public static void showDate() {
        System.out.printf("| %-10s | %-25s | %-12s | %-20s | %-5s |%n",
                "ID", "HO TEN", "NGAY SINH", "NGANH", "GPA");
        System.out.println("--------------------------------------------------------------------------------------");
    
        for (Student x : list) {
            x.printInfo();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pick;
        boolean ok = true;

        while (ok == true) {
            System.out.println("\n========= MENU QUAN LY SINH VIEN =========");
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Sua diem sinh vien");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("==========================================");
            System.out.print("Moi ban chon chuc nang: ");

            pick = scan.nextInt();
            if (pick == 0) {
                ok = false;
            }
            else if (pick == 1) {
                inputData();
            }
            else if (pick == 2) {
                showDate();
            }
            
        }
    }
}