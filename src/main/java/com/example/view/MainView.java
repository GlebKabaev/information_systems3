package com.example.view;
import javax.swing.*;
import java.util.*;
import com.example.controller.MainViewController ;
// import com.example.controller.Observer;
public class MainView  {
    private static MainView mainView;
    private JFrame frame = new JFrame("Главное окно");
    private JLabel label = new JLabel("Welcome");
    private JList<String> jlist=new JList<>() ;
    private JTextField textField = new JTextField();
    private JButton button = MainViewController.testButton(textField,label);
    private JButton getButton = MainViewController.getButton(jlist);
    
    
    // public void update(ArrayList<String> newInfo) {
    //     jlist=new JList<>(newInfo.toArray(new String[0]));
    // }
    private MainView() {
        // frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
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
        //jlist
        jlist.setBounds(50,180, 900, 900);
        frame.add(jlist); 
    }
    
    //синглтон 
    public static MainView openFrame() {
        if(mainView == null){
            mainView = new MainView();
        }
        return mainView;
    }
}
