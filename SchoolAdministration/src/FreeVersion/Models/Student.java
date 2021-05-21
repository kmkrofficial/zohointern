package FreeVersion.Models;

public class Student {

    private String studentName;
    private String studentClass;
    private int studentRollNumber;
    private String studentGender;
    private String studentECA;

    public Student(String studentName, int studentRollNo, String studentGender, String studentClass) {
        this.studentGender = studentGender;
        this.studentName = studentName;
        this.studentRollNumber = studentRollNo;
        this.studentClass = studentClass;
        this.studentECA = "Yet to be updated";
    }

    public Student(String studentName, String studentClass, int studentRollNumber, String studentGender, String studentECA) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentGender = studentGender;
        this.studentRollNumber = studentRollNumber;
        this.studentECA = studentECA;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentECA() { return studentECA; }

    public void setStudentECA(String studentECA) { this.studentECA = studentECA; }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", studentRollNumber=" + studentRollNumber +
                ", studentGender='" + studentGender + '\'' +
                '}';
    }
}
