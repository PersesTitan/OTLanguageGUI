package object;

import inf.Create;

import javax.swing.*;

public class Label implements Create {

    @Override
    public void create(String text) {
        JLabel label = new JLabel(text);
    }

    @Override
    public void create() {
        JLabel label = new JLabel();
    }
}
