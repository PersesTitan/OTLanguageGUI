package object;

import inf.Create;

import javax.swing.*;

public class Button implements Create {

    @Override
    public void create(String text) {
        JButton button = new JButton(text);
    }

    @Override
    public void create() {
        JButton button = new JButton();
    }
}
