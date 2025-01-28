package lab13.task3;

import java.awt.*;

public class TextEditor {
    TextFormatter formatter;
    public void setFormatter(TextFormatter formatter) {
        if(formatter == null)   this.formatter = null;
        if(formatter instanceof UpperCaseFormatter)   this.formatter = new UpperCaseFormatter();
        else if(formatter instanceof LowerCaseFormatter)   this.formatter = new LowerCaseFormatter();
        else if(formatter instanceof CamelCaseFormatter)   this.formatter = new CamelCaseFormatter();
        else throw new IllegalArgumentException("Unsupported formatter");
    }
    public String formatText(String text) {
        return this.formatter.formatText(text);
    }
}
