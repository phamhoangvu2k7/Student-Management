package student_management;

public class Student {
    private String studentID;
    private String fullName;
    private String dateOfBirth;
    private String major;
    private double gpa;

    Student(String studentID, String fullName, String dateOfBirth, String major, double gpa) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }


    public void printInfo() {
        System.out.printf("| %-10s | %-25s | %-12s | %-20s | %5.2f |%n",
                studentID, fullName, dateOfBirth, major, gpa);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (0.0 > gpa || gpa <= 4.0) {
            this.gpa = gpa;
        }
        else {
            System.err.println("Lỗi: Điểm GPA phải từ 0.0 đến 4.0 !");
        }
    }
}
