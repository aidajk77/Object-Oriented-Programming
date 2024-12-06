package lab10.task3;

import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;

public class Events {
    private Timestamp time;
    private int id;
    private String eventType;

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public static void generateEventFile(String fileName, int numberOfRecords) throws IOException {
        String[] eventTypes = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
        long startMillis = Timestamp.valueOf("2020-01-01 00:00:00").getTime();
        long endMillis = Timestamp.valueOf("2023-12-31 23:59:59").getTime();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < numberOfRecords; i++) {
            Random random = new Random();
            long randomMillis = new Random().nextLong(startMillis, endMillis);
            randomMillis = Math.abs(randomMillis);
            Timestamp timestamp = new Timestamp(randomMillis);
            int indexOfEventType = random.nextInt(eventTypes.length);
            int userId = random.nextInt(1000);
            writer.write(timestamp + " | " + "Event type: "+eventTypes[indexOfEventType] + " | " + "User ID: "+userId + "\n");
        }
        writer.close();
    }

    public static void printEventsFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static ArrayList<Events> readEventsFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        ArrayList<Events> events = new ArrayList<>();
        while((line = reader.readLine()) != null) {
             String[] eventTypes = line.split(" \\| ");
             Events tempEvent = new Events();
             for (int i = 0; i < eventTypes.length; i++) {
                 if(i==0){
                     System.out.println(eventTypes[i]);
                     tempEvent.setTime(Timestamp.valueOf(eventTypes[0]));
                 }else if(i==1){
                     System.out.println(eventTypes[i]);
                     tempEvent.setEventType(eventTypes[1]);
                 }else{
                     System.out.println(eventTypes[i]);
                     int tempId = Integer.parseInt(eventTypes[i].substring(9));
                     tempEvent.setId(tempId);
                 }
             }
             events.add(tempEvent);

        }
        reader.close();
        return events;
    }
    @Override
    public String toString(){
        return "Events [time=" + time + ", eventType=" + eventType + ", id=" + id + "]";
    }
}
