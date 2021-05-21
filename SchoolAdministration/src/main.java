import FreeVersion.Controller.NonteachingFaculties;
import FreeVersion.Controller.*;

public class main {

    // Cloud Software

    public static void institution1() {
        Administration obj = new Administration("somekey");
        Students students = obj.getStudents();
        Teachers teachers = obj.getTeachers();
        NonteachingFaculties ntfs = obj.getNonteachingfaculties();
    }

    public static void institution2() {
        Administration obj = new Administration();
        Students students = obj.getStudents();
        Teachers teachers = obj.getTeachers();
        NonteachingFaculties ntfs = obj.getNonteachingfaculties();
    }

    public static void main(String[] args) {
        institution1();
    }

}
