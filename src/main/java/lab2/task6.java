package lab2;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        printText(a);
    }
    public static void printText(int a){
        for(int i=0;i<a;i++){
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }
    }
}
