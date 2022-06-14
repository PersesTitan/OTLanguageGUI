package object;

import inf.Create;

import javax.swing.*;

public class Frame implements Create {

    @Override
    public void create(String text) {
        JFrame frame = new JFrame(text);
    }

    @Override
    public void create() {
        JFrame frame = new JFrame();
    }
}
