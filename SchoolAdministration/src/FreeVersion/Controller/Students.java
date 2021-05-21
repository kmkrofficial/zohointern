package FreeVersion.Controller;

import FreeVersion.Models.Student;

import java.util.ArrayList;

public class Students {

    protected ArrayList<Student> students;

    public Students() {
        students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addNewStudent(String name, String className, int rollNo, String gender, String ECA) {
        Thread thread = new Thread(()->{
            Student newStudent = new Student(name, className, rollNo, gender, ECA);
            ArrayList<Student> arrayStudents = this.getStudents();
            arrayStudents.add(newStudent);
            this.setStudents(arrayStudents);
        });
        thread.run();
    };

    public void removeStudent(int rollNo) {
        Thread thread = new Thread(()->{
            for(Student s: students) {
                if (s.getStudentRollNumber() == rollNo) {
                    students.remove(s);
                    break;
                }
            }
            System.out.print("The record was removed successfully.");
        });
        thread.run();
    }

    public Student searchStudent(int rollNo) {
        Student result = null;
        for(Student i: this.getStudents()) {
            if (i.getStudentRollNumber() == rollNo) {
                result = i;
                break;
            }
        }
        return result;
    }

    public void displayStudents() {
        for (Student i: this.getStudents()) {
            System.out.println(i.getStudentRollNumber()+"    "+i.getStudentName()+"    "+i.getStudentClass()+"    "+i.getStudentGender());
        }
    }


}
