package FreeVersion.Controller;

import FreeVersion.Models.Teacher;

import java.util.ArrayList;

public class Teachers {

    protected ArrayList<Teacher> teachers;

    public Teachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Teachers() {
        teachers = new ArrayList<Teacher>();
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addNewTeacher(String name, String post, long salary) {
        Thread thread = new Thread(()-> {
            try {
                Teacher newTeacher = new Teacher(name, post, salary);
                teachers.add(newTeacher);
            }
            catch (Exception e) {
                System.out.print("An Error Occurred: "+e+"\n Please Try Again.");
            }
        });
        thread.run();
    }

    public void removeTeacher(String name) {
        for(Teacher s: teachers) {
            if (s.getTeacherName() == name) {
                teachers.remove(s);
                break;
            }
        }
        System.out.print("The record was removed successfully.");
    }

    public Teacher searchTeacher(String name) {
        Teacher result = null;
        for(Teacher i: teachers) {
            if (i.getTeacherName() == name) {
                result = i;
                break;
            }
        }
        return result;
    }
}
