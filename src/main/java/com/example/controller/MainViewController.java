package com.example.controller;
import com.example.model.ShortBook;
import com.example.model.repository.Book_rep_DB;

import javax.swing.*;
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainViewController {
    
    public static JButton showButton(JTextField textField,JLabel label) {
        JButton button = new JButton("Показать текст");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Получение текста из текстового поля и вывод в консоль
                
                String text = textField.getText();
                label.setText(text);
                System.out.println("Введенный текст: " + text);
            }
    });
    
    return button;
}
public static JButton getButton(JList<String> jlist) {
    JButton button = new JButton("Показать книги");
    
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int n=1000000;
            Book_rep_DB db=Book_rep_DB.getInstance();
            List<ShortBook> books;
            String[] arr=new String[n];
            try{
            
            books=db.get_k_n_shortList(0, n);
            for(int i=0; i<books.size(); i++){
                arr[i]=books.get(i).toString();
            }
            jlist.setListData(arr);
            }catch(Exception err){
                System.out.println(err.getMessage());
            }
            
            // String text = textField.getText();
            // label.setText(text);
            // System.out.println("Введенный текст: " + text);

            
        }
});

return button;
}



}
