package udemyCourse1.proyekt2ay.bean;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class Test {
    public static void main(String[] args) throws NoSuchMethodException {

        Teacher t = new Teacher();
        checkObjNotNull(t);

    }

    private static void checkObjNotNull(Object t) {
        Method[] methods = t.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {

            Method m = methods[i];
            Annotation[] anns = m.getAnnotations();
            System.out.println(methods[i].getName());
            for (int j = 0; j < anns.length; j++) {
                Annotation ann = anns[j];
                System.out.println("ann" + ann.annotationType());

            }
            System.out.println("------------------");
        }
    }
=======
public class Test {


>>>>>>> origin/master
}
