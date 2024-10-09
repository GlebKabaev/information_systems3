
package com.example.view;
import javax.swing.*;

public class AddView {
    private JFrame frame = new JFrame("Добавить книгу");
    private AddView() {
        // frame
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    //синглтон
    public static AddView openFrame() {
        return new AddView();
    }
}
