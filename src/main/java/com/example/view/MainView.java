package com.example.view;
import java.util.List;

import javax.swing.*;
// import com.example.controller.Observer;
public class MainView  {
    private static MainView mainView;
    private JFrame frame = new JFrame("Главное окно");
    private JLabel label = new JLabel("Welcome");
    private JList<String> jlist=new JList<>() ;
    private JTextField textField = new JTextField();
    private JButton button=new JButton("Test");
    private JButton getButton = new JButton("Get Books"); 
    private JButton addButton = new JButton("Добавить книгу");
    
    
    // public void update(ArrayList<String> newInfo) {
    //     jlist=new JList<>(newInfo.toArray(new String[0]));
    // }
    private MainView() {
        // frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,900);
        frame.setLayout(null);
        //lable
        label.setBounds(50, 150, 200, 30);
        frame.add(label); 
        // textField
        textField.setBounds(50, 30, 200, 30); 
        frame.add(textField);
        // button
        button.setBounds(50, 80, 200, 30); 
        frame.add(button);
        // getButton
        getButton.setBounds(260, 80, 200, 30);
        frame.add(getButton); 
        //addButton
        addButton.setBounds(470, 80, 200, 30);
        frame.add(addButton);
        //jlist
        jlist.setBounds(50,180, 900, 900);
        frame.add(jlist); 
    }
    public void openFrame() {
        frame.setVisible(true);
    }
    //синглтон 
    public static MainView getInstance() {
        if(mainView == null){
            mainView = new MainView();
        }
        return mainView;
    }
    //getters
    public JFrame getFrame() {
        return frame;
    }
    public JLabel getLabel() {
        return label;
    }
    public JList<String> getJlist() {
        return jlist;
    }
    public JTextField getTextField() {
        return textField;
    }
    public JButton getButton() {
        return button;
    }
    public JButton getGetButton() {
        return getButton;
    }
    public JButton getAddButton() {
        return addButton;
    }
    //setters
    public void setLabel(String text) {
        label.setText(text);
    }
    public void setJlist(List<String> newInfo) {
        jlist.setListData(newInfo.toArray(new String[0]));
    }
    public void setTextField(String text) {

        textField.setText(text);
    }
    public void setButton(JButton newButton) {
        button = newButton;
    }
    public void setGetButton(JButton newGetButton) {
        getButton = newGetButton;
    }
    public void setAddButton(JButton newAddButton) {
        addButton = newAddButton;
    }
    
}
