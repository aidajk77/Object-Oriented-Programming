package lab13.task3;

public class UpperCaseFormatter implements TextFormatter{
    public String formatText(String text) {
        text = text.toUpperCase();
        return text;
    }
}
