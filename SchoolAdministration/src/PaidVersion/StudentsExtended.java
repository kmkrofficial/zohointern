package PaidVersion;

import FreeVersion.Models.Student;
import FreeVersion.Controller.Students;
import java.util.ArrayList;


public class StudentsExtended extends Students {

    private String someVariable="Sample Value";

    public String getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(String someVariable) {
        this.someVariable = someVariable;
    }

    public ArrayList<Student> FilterByClass(String className) {
        ArrayList<Student> result = new ArrayList<>();
        for(Student i: students) {
            if(i.getStudentClass() == className) result.add(i);
        }
        return result;
    }

    public ArrayList<Student> FilterStudentByECA(String eca) {
        ArrayList<Student> result = new ArrayList<>();
        for(Student i: students) {
            if(i.getStudentECA() == eca) result.add(i);
        }
        return result;
    }




}
