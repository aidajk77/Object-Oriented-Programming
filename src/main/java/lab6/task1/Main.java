package lab6.task1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        NightSky nightSky = new NightSky(0.1, 8, 4);
        nightSky.printLine();
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
        System.out.println("");
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());

    }
}
