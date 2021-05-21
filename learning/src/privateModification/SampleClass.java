package privateModification;

public class SampleClass {

    private String name;

    public SampleClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printName() {
        System.out.print(name);
    }

}
