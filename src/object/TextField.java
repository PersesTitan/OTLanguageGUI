package object;

import inf.Create;

import javax.swing.*;
import java.util.regex.Pattern;

public class TextField implements Create {
    private final static String PATTERN = "(^|\\s+|\\n)ㄱㅌㄱ($|\\s+)";
    private final static Pattern pattern = Pattern.compile(PATTERN);
    private JTextField textField;

    @Override
    public void setText(String text) {
        if (textField == null) throw new NullPointerException(textFieldNull);
        textField.setText(text);
    }

    @Override
    public void create(String text) {
        textField = new JTextField(text);
    }

    @Override
    public void create() {
        textField = new JTextField();
    }

    @Override
    public boolean check(String line) {
        return pattern.matcher(line).find();
    }
}
