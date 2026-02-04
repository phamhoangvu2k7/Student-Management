package student_management;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    static HashMap<String, Student> listStudent = new HashMap<>();

    // Fucntion 1: Input data of student
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
            listStudent.put(studentID, s1);
    
            System.out.print("Ban co muon ket thuc chuong trinh khong (Yes/No): ");
            String t = scan.nextLine().toLowerCase();
            if (t.compareTo("yes") == 0) {
                System.out.println(t + " " + ok);
                ok = false;
            }
        }
    }

    // Fucntion 2: Show data of student
    public static void showData() {
        System.out.printf("| %-10s | %-25s | %-12s | %-20s | %-5s |%n",
                "ID", "HO TEN", "NGAY SINH", "NGANH", "GPA");
        System.out.println("--------------------------------------------------------------------------------------");
    
        for (Student x : listStudent.values()) {
            x.printInfo();
        }
    }
    // Fucntion 3: Delete data of student
    public static void deleteData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ID cua sinh vien ma ban muon xoa : ");
        String id = scan.nextLine();
        listStudent.remove(id);
    }

    // Fucntion 4: Change data of student
    public static void changeData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ID cua sinh vien ma ban muon sua : ");
        String id = scan.nextLine();
        Student student = listStudent.get(id);

        System.out.println("Ban muon chinh sua muc nao : ");
        System.out.println("1. ID cua hoc sinh ");
        System.out.println("2. Ten cua hoc sinh ");
        System.out.println("3. Ngay sinh cua hoc sinh ");
        System.out.println("4. Nganh cua hoc sinh ");
        System.out.println("5. Gpa cua hoc sinh ");
        System.out.print("Moi ban chon chuc nang : ");
        int pick = Integer.parseInt(scan.nextLine());
        if (pick == 1) {
            System.out.print("Nhap ID moi : ");
            String idNew = scan.nextLine();
            student.setStudentID(idNew);
        }
        else if (pick == 2) {
            System.out.print("Nhap ho ten moi : ");
            String nameNew = scan.nextLine();
            student.setFullName(nameNew);
        }
        else if (pick == 3) {
            System.out.print("Nhap ngay sinh moi : ");
            String dobNew = scan.nextLine();
            student.setDateOfBirth(dobNew);
        }
        else if (pick == 4) {
            System.out.print("Nhap nganh moi : ");
            String majorNew = scan.nextLine();
            student.setDateOfBirth(majorNew);
        }
        else if (pick == 5) {
            System.out.print("Nhap gpa moi : ");
            String gpaNew = scan.nextLine();
            student.setGpa(Double.parseDouble(gpaNew));
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
            scan.nextLine(); 
            
            if (pick == 0) {
                ok = false;
            }
            else if (pick == 1) {
                inputData();
            }
            else if (pick == 2) {
                showData();
            }
            else if (pick == 3) {
                deleteData();
            }
            else if (pick == 4){
                changeData();
            }
        }
    }
}