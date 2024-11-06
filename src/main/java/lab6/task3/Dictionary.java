package lab6.task3;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String,String> dictionary;
    public Dictionary() {
        dictionary = new HashMap<>();
    }
    public String translate(String word) {
        if(dictionary.containsKey(word))
            return "Translation of the word " + word + " is "+ dictionary.get(word);
        return "Word "+word+" is not in the dictionary";
    }
    public void add(String word, String translation) {
        dictionary.put(word,translation);
    }
    public int amountOfWords() {
        return dictionary.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for(String key : dictionary.keySet()){
            list.add(key+" : "+dictionary.get(key));
        }
        return list;
    }
}
