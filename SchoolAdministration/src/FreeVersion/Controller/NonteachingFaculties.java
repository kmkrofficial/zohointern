package FreeVersion.Controller;

import FreeVersion.Models.NonTeachingFaculty;
import java.util.ArrayList;

public class NonteachingFaculties {

    private ArrayList<NonTeachingFaculty> ntfs;

    public void addNTF(String name, int age, String post) {
        Thread thread = new Thread(() -> {
            try {
                NonTeachingFaculty newEmployee = new NonTeachingFaculty(name, age, post);
                ntfs.add(newEmployee);
            }
            catch (Exception e) {
                System.out.print("An error occurred:"+e+"\nTry Again");
            }
        });
        thread.run();
    }

    public void removeNTF(String name) {
        Thread thread = new Thread(() -> {
            for(NonTeachingFaculty i: ntfs) {
                if(i.getNtfName() == name) {
                    ntfs.remove(i);
                }
            }
            System.out.print("The record was removed successfully.");
        });
        thread.run();
    }

    public void printAll() {
        Thread thread = new Thread(()->{
            for(NonTeachingFaculty i: ntfs) {
                System.out.println(i.getNtfName()+"   "+i.getNtfAge()+"   "+i.getNtfPost());
            }
        });
        thread.run();
    }

    public ArrayList<NonTeachingFaculty> getNtfs() {
        return ntfs;
    }

    public void setNtfs(ArrayList<NonTeachingFaculty> ntfs) {
        this.ntfs = ntfs;
    }
}
