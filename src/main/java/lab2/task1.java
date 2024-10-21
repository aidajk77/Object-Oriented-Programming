package lab2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String password="abcdefgh";
        System.out.println("Enter a password");
        String guess=reader.nextLine();
        while(!(guess.equals(password))){
            System.out.println("Wrong, try again");
            guess=reader.nextLine();
        }
        System.out.println("Bravo");

    }
}
