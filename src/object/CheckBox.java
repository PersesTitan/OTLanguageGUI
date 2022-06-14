package object;

import inf.Create;

import javax.swing.*;

public class CheckBox implements Create {

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
}
