package object;

import inf.Create;

import javax.swing.*;

public class Label implements Create {

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
}
