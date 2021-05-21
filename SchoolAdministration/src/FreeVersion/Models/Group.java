package FreeVersion.Models;

import java.util.ArrayList;

public class Group {

    private ArrayList<Student> students;
    private String group;

    public Group(ArrayList<Student> students, String group) {
        this.students = students;
        this.group = group;
    }

    public Group(String group) {
        this.students = new ArrayList<Student>();
        this.group = group;
    }

    public void addNewStudent(Student s) {
        students.add(s);
    }

}
