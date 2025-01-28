package lab13.task3;

public class LowerCaseFormatter implements TextFormatter {
    public String formatText(String text) {
        text = text.toLowerCase();
        return text;
    }
}

