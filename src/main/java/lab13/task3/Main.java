package lab13.task3;

public class Main {
    public static void main(String[] args) {
        UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
        TextEditor textEditor = new TextEditor();
        textEditor.setFormatter(upperCaseFormatter);
        System.out.println(textEditor.formatText("abcd"));
    }
}
