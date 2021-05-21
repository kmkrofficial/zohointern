package FreeVersion.Models;

public class NonTeachingFaculty {

    private String ntfName;
    private int ntfAge;
    private String ntfPost;


    public NonTeachingFaculty(String ntfName, int ntfAge, String ntfPost) {
        this.ntfName = ntfName;
        this.ntfAge = ntfAge;
        this.ntfPost = ntfPost;
    }

    public String getNtfName() {
        return ntfName;
    }

    public void setNtfName(String ntfName) {
        this.ntfName = ntfName;
    }

    public int getNtfAge() {
        return ntfAge;
    }

    public void setNtfAge(int ntfAge) {
        this.ntfAge = ntfAge;
    }

    public String getNtfPost() {
        return ntfPost;
    }

    public void setNtfPost(String ntfPost) {
        this.ntfPost = ntfPost;
    }

    @Override
    public String toString() {
        return "NonTeachingFaculty{" +
                "ntfName='" + ntfName + '\'' +
                ", ntfAge=" + ntfAge +
                ", ntfPost='" + ntfPost + '\'' +
                '}';
    }

}
