package object;

import inf.Create;

import javax.swing.*;

public class Frame implements Create {

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
}
