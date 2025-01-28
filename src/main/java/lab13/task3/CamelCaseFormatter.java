package lab13.task3;

public class CamelCaseFormatter implements TextFormatter {
    public String formatText(String text) {
        String result = "";
        for(String word : text.split(" ")) {
            if(word.length() > 1) {
                result += word.substring(0, 1).toUpperCase() + word.substring(1);
            } else {
                result += word.toLowerCase();
            }
        }
        return result;
    }
}
