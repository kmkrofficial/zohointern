package FreeVersion.Models;

public class Teacher {

    private String teacherName;
    private String teacherPost;
    private long teacherSalary;

    public Teacher(String teacherName, String teacherPost, long teacherSalary) {
        this.teacherName = teacherName;
        this.teacherPost = teacherPost;
        this.teacherSalary = teacherSalary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPost() {
        return teacherPost;
    }

    public void setTeacherPost(String teacherPost) {
        this.teacherPost = teacherPost;
    }

    public long getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(long teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherPost='" + teacherPost + '\'' +
                ", teacherSalary=" + teacherSalary +
                '}';
    }

}
