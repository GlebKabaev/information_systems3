package com.example.controller;
import com.example.model.ShortBook;
import com.example.model.repository.Book_rep_DB;
import com.example.view.AddView;

import javax.swing.*;
import java.util.*;
import com.example.view.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainViewController implements Observer{
    private MainView mv;
    private static MainViewController mvc;
    private MainViewController(MainView mv){
        this.mv=mv;
        setTestActionListener(mv.getButton());
        setGetActionListener(mv.getGetButton());
        setAddActionListener(mv.getAddButton());
    }
    public static MainViewController getInstance(MainView mainView){
        if (mvc != null){
            return mvc;
        }
        return new MainViewController(mainView);
    }
    public  void setTestActionListener(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = mv.getTextField().getText();
                mv.getLabel().setText(text);
                System.out.println("Введенный текст: " + text);
            }
        });
    }

    private void setGetActionListener(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO пагинацию бы
                update();
            }
    });
    }


    private  void setAddActionListener(JButton button){

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddView.openFrame();
            }
    });
    }

    public void update(){
        JList<String> jlist = mv.getJlist();
        int n=200;
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
    }

}
