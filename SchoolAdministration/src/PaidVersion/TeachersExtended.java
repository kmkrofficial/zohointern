package PaidVersion;

import FreeVersion.Models.Teacher;
import FreeVersion.Controller.Teachers;

import java.util.ArrayList;

public class TeachersExtended extends Teachers implements Encryptable {

    public ArrayList<Teacher> FilterThroughSalary(long income) {
        ArrayList<Teacher> arr = new ArrayList<>();
        for (Teacher i : teachers) {
            if (i.getTeacherSalary() == income) arr.add(i);
        }
        return arr;
    }

    public void ModifyName(String currentName, String changingTheNameTo) {
        for(Teacher i: teachers) {
            if (i.getTeacherName() == currentName) i.setTeacherName(changingTheNameTo);
            break;
        }
    }

    public void ModifyTeacherPostAndSalary(String teacherName, String changingPost, long changingSalary) {
        for(Teacher i: teachers) {
            if (i.getTeacherName() == teacherName) {
                i.setTeacherPost(changingPost);
                i.setTeacherSalary(changingSalary);
                break;
            }
        }
    }

    public void IncrementSalary(String teacherName, long increment) {
        for(Teacher i: teachers) {
            if(i.getTeacherName() == teacherName) i.setTeacherSalary(i.getTeacherSalary() + increment);
            break;
        }
    }


    public String decryption(String data) {
        return null;
    }

    public String encryption(String data) {
        return null;
    }


}


