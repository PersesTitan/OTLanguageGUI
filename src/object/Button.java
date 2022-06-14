package object;

import inf.Create;

import javax.swing.*;

public class Button implements Create {

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
}
