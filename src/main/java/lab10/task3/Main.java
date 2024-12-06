package lab10.task3;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Events.generateEventFile("task3",3);
        Events.printEventsFromFile("task3");
        ArrayList<Events> events = Events.readEventsFromFile("task3");
        for(Events event : events) {
            System.out.println(event);
        }


    }
}
