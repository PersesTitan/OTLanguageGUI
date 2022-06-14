package object;

import inf.Create;

import javax.swing.*;

public class Frame implements Create {

    @Override
    public void crate(String text) {
        JFrame frame = new JFrame(text);
    }

    @Override
    public void crate() {
        JFrame frame = new JFrame();
    }
}
