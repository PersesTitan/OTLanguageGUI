package object;

import inf.Create;

import javax.swing.*;
import java.util.regex.Pattern;

public class Frame implements Create {
    private final static String PATTERN = "(^|\\s+|\\n)ㄱㅍㄱ(\\s+|$)";
    private final static Pattern pattern = Pattern.compile(PATTERN);
    private JFrame frame;

    @Override
    public void setText(String text) {
        if (frame == null) throw new NullPointerException(frameNull);
        frame.setTitle(text);
    }

    @Override
    public void create(String text) {
        this.frame = new JFrame(text);
    }

    @Override
    public void create() {
        this.frame = new JFrame();
    }

    @Override
    public boolean check(String line) {
        return pattern.matcher(line).find();
    }
}
