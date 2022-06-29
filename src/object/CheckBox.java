package object;

import inf.Create;

import javax.swing.*;
import java.util.regex.Pattern;

public class CheckBox implements Create {
    private final static String PATTERN = "(^|\\n|\\s+)ㄱㅊㄱ($|\\s+)";
    private final static Pattern pattern = Pattern.compile(PATTERN);
    private JCheckBox checkBox;

    @Override
    public void setText(String text) {
        if (checkBox == null) throw new NullPointerException(checkBoxNull);
        checkBox.setText(text);
    }

    @Override
    public void create(String text) {
        this.checkBox = new JCheckBox(text);
    }

    @Override
    public void create() {
        this.checkBox = new JCheckBox();
    }

    @Override
    public boolean check(String line) {
        return pattern.matcher(line).find();
    }
}
