package privateModification;
import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {
        Class<?> cls;
        SampleClass obj = new SampleClass("Keerthi Raajan");
        {
            try {
                cls = Class.forName("privateModification.SampleClass");
                Field field = cls.getDeclaredField("name");
                field.setAccessible(true);
                Object object = field.get(obj);
                String result = (String)object;
                System.out.println(result);

                Method[] methods = cls.getDeclaredMethods();
                for(Method i: methods) {
                    System.out.println(i.getName()+" "+Modifier.toString(i.getModifiers()));
                }

            } catch (Exception e) {
                System.out.println("Error Occurred: "+e.getMessage()+" ");
                e.printStackTrace();
            }
        }
    }

}
