package object;

import inf.Create;

import javax.swing.*;
import java.util.regex.Pattern;

public class PasswordField implements Create {
    private final static String PATTERN = "(\\n|\\s+|^)ㄱㅁㄱ(\\s+|$)";
    private final static Pattern pattern = Pattern.compile(PATTERN);
    private JPasswordField passwordField;

    @Override
    public void setText(String text) {
        if (passwordField == null) throw new NullPointerException(passwordFieldNull);
        passwordField.setText(text);
    }

    @Override
    public void create(String text) {
        passwordField = new JPasswordField(text);
    }

    @Override
    public void create() {
        passwordField = new JPasswordField();
    }

    @Override
    public boolean check(String line) {
        return pattern.matcher(line).find();
    }
}
