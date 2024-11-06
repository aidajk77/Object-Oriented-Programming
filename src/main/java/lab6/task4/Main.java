package lab6.task4;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        genF1(list);
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        reverseList(list);
        for(int i : list){
            System.out.print(i + " ");
        }

    }
    public static <T extends Number> void genF1(ArrayList<T> list) {
        int sumE=0;
        int sumO=0;
       for(T i : list) {
           if(i instanceof Integer){
                if((int)i%2==0) sumE+=(int)i;
                if((int)i%2==1) sumO+=(int)i;
           }
       }
        System.out.println("Sum of even numbers: "+sumE);
        System.out.println("Sum of odd numbers: "+sumO);
    }

    public static <T> void reverseList(ArrayList<T> list) {
        Collections.reverse(list);
    }
}
