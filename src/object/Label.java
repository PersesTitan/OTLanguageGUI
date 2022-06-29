package object;

import inf.Create;

import javax.swing.*;
import java.util.regex.Pattern;

public class Label implements Create {
    private final static String PATTERN = "(^|\\s+|\\n)ㄱㄹㄱ(\\s+|$)";
    private final static Pattern pattern = Pattern.compile(PATTERN);
    private JLabel label;

    @Override
    public void setText(String text) {
        if (label == null) throw new NullPointerException(labelNull);
        label.setText(text);
    }

    @Override
    public void create(String text) {
        label = new JLabel(text);
    }

    @Override
    public void create() {
        label = new JLabel();
    }

    @Override
    public boolean check(String line) {
        return pattern.matcher(line).find();
    }
}
