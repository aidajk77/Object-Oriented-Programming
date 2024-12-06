package lab10.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Student student = new Student(1,"student1", new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        GradeAnalyzer analyzer = new GradeAnalyzer(student.getGrades());
        Field[] fields1 = student.getClass().getDeclaredFields();
        Field[] fields2 = analyzer.getClass().getDeclaredFields();
        System.out.println("Fields in Student class");
        System.out.println("__________________");
        for(Field f : fields1){
            f.setAccessible(true);
            System.out.println(f.getName()+": "+f.get(student));
        }
        System.out.println("Fields in GradeAnalyzer");
        System.out.println("_____________________");
        for(Field f : fields2){
            f.setAccessible(true);
            System.out.println(f.getName()+": "+f.get(analyzer));
        }

        Method[] methods1 = student.getClass().getDeclaredMethods();
        Method[] methods2 = analyzer.getClass().getDeclaredMethods();
        System.out.println("Methods in Student class");
        System.out.println("_________________");
        for(Method m : methods1){
            m.setAccessible(true);
            if(m.getName().startsWith("print")||m.getName().startsWith("calculate")){
                if(m.getReturnType().getName().equals("void")){
                    m.invoke(student);
                }else{
                    System.out.println(m.invoke(student));
                }
            }

        }
        System.out.println();
        System.out.println("Methods in GradeAnalyzer");
        System.out.println("________________");

        for(Method m : methods2){
            m.setAccessible(true);
            if(m.getName().startsWith("print")||m.getName().startsWith("calculate")){
                if(m.getReturnType().getName().equals("void")){
                    m.invoke(analyzer);
                }else{
                    System.out.println("Result of method "+m.invoke(analyzer));
                }
            }

        }



    }
}
