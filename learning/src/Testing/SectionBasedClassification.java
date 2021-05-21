package Testing;

import java.util.ArrayList;

class Student {
    private String Name;
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

class Groups {

    private ArrayList<Student> students;
    private String group;

    Groups(String group) {
        this.group = group;
        students = new ArrayList<>();
    }

    public void addNewStudent(Student student) {
        students.add(student);
    }

    public Student findStudentUsingMarks(int marks) {
        for(Student i: students) {
            if (i.getTotal() == marks) {
                return i;
            }
        }
        return null;
    }

    public Student findHighestMark() {
        Student temp = null;
        int marks = 0;
        for (Student i:students) {
            if (i.getTotal()>=marks) {
                temp = i;
                marks = i.getTotal();
            }
        }
        return temp;
    }

    public ArrayList<Student> getStudent() {
        return students;
    }

    public void setStudent(ArrayList<Student> student) {
        this.students = student;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

public class SectionBasedClassification {

    public static void main(String[] args) {



    }

}
