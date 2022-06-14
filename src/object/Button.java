package object;

import inf.Create;

import javax.swing.*;

public class Button implements Create {


    @Override
    public void crate(String text) {
        JButton button = new JButton(text);
    }

    @Override
    public void crate() {
        JButton button = new JButton();
    }
}
