package lab4.people;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
        printDepartment(people);
    }

    public static void printDepartment(List<Person> people){
        System.out.println("All the persons are: ");
        for(Person p : people){
            System.out.println("  "+p);
        }
    }


}


