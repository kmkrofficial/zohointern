import FreeVersion.Controller.NonteachingFaculties;
import FreeVersion.Controller.Students;
import FreeVersion.Controller.Teachers;
import PaidVersion.EncryptionHandler;
import PaidVersion.StudentsExtended;
import PaidVersion.TeachersExtended;

public class Administration {

    private String key = "UNPAID";
    private Students students;
    private StudentsExtended studentsExtended;
    private Teachers teachers;
    private TeachersExtended teachersExtended;
    private NonteachingFaculties nonteachingfaculties;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    Administration(String key) {
        this.key = key;
        studentsExtended = new StudentsExtended();
        teachersExtended = new TeachersExtended();
        EncryptionHandler.encryptAndPrint(teachersExtended);
        nonteachingfaculties = new NonteachingFaculties();
    }

    Administration() {
        students = new Students();
        teachers = new Teachers();
        nonteachingfaculties = new NonteachingFaculties();
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public NonteachingFaculties getNonteachingfaculties() {
        return nonteachingfaculties;
    }

    public void setNonteachingfaculties(NonteachingFaculties nonteachingfaculties) {
        this.nonteachingfaculties = nonteachingfaculties;
    }

    public StudentsExtended getStudentsExtended() {
        if (key == "UNPAID") {
            System.out.print("Buy the full software!");
            return null;
        }
        else {
            return studentsExtended;
        }
    }

    public void setStudentsExtended(StudentsExtended studentsExtended) {
        if (key == "UNPAID") {
            System.out.print("Buy the full software!");
        }
        else {
            this.studentsExtended = studentsExtended;
        }
    }

    public TeachersExtended getTeachersExtended() {
        if (key == "UNPAID") {
            System.out.print("Buy the full software!");
            return null;
        }
        else {
            return teachersExtended;
        }
    }

    public void setTeachersExtended(TeachersExtended teachersExtended) {
        if (key == "UNPAID") {
            System.out.print("Buy the full software!");
        }
        else {
            this.teachersExtended = teachersExtended;
        }
    }

}
