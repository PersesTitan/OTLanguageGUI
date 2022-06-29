package object;

import inf.Create;

import javax.swing.*;
import java.util.regex.Pattern;

public class Button implements Create {
    private final static String PATTERN = "(\\n|^|\\s+)ㄱㅂㄱ($|\\s+)";
    private final static Pattern pattern = Pattern.compile(PATTERN);
    private JButton button;

    @Override
    public void setText(String text) {
        if (button == null) throw new NullPointerException(buttonNull);
        this.button.setText(text);
    }

    @Override
    public void create(String text) {
        this.button = new JButton(text);
    }

    @Override
    public void create() {
        this.button = new JButton();
    }

    @Override
    public boolean check(String line) {
        return pattern.matcher(line).find();
    }
}
