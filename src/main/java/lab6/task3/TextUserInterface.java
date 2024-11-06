package lab6.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    public void start(){
        ArrayList<String> commands = new ArrayList<>(Arrays.asList("quit", "translate" , "add"));
        while(true){
            System.out.println("Statement");
            System.out.println("\t quit - quit the text interface");
            System.out.println("\t translate - asks a word and prints its translation");
            System.out.println("\t add - adds a word pair to the dictionary");
            String command = reader.nextLine();
            if(!(commands.contains(command))){
                System.out.println("Unknown command");
            }
            else if(command.equals(commands.get(0))){
                System.out.println("Cheers");
                return;
            }else if(command.equals(commands.get(1))){
                System.out.println("Enter the word");
                String word=reader.nextLine();
                System.out.println(translate(word));
            }else {
                System.out.println("Enter the word");
                String word = reader.nextLine();
                System.out.println("Enter the translation");
                String translation = reader.nextLine();
                add(word, translation);
            }
        }


    }
    public String translate(String word){
        return this.dictionary.translate(word);

    }
    public void add(String word, String translation){
        this.dictionary.add(word, translation);
    }
}
