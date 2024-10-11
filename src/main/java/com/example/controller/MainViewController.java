package com.example.controller;
import com.example.model.BookModel;
import com.example.model.ShortBook;
import com.example.model.repository.Book_rep_DB;
import com.example.view.AddView;

import javax.swing.*;
import java.util.*;
import com.example.view.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainViewController implements Observer{
    private MainView mv=MainView.getInstance();
    private static MainViewController mvc;

    private MainViewController(){
        setTestActionListener(mv.getButton());
        setGetActionListener(mv.getGetButton());
        setAddActionListener(mv.getAddButton());
    }
    public static MainViewController getInstance(){
        if (mvc == null){
            mvc = new MainViewController();
        }
        return mvc;
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
                AddView av= AddView.getInstance();
                av.openFrame();
            }
        });
    }

    public void update(){
        JList<String> jlist = mv.getJlist();
        int n=200;
        BookModel bm=BookModel.getInstance();
        List<ShortBook> books;
        String[] arr=new String[n];
        try{
        
            books=bm.get_k_n_shortList(0, n);
            for(int i=0; i<books.size(); i++){
                arr[i]=books.get(i).toString();
            }
            jlist.setListData(arr);
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
    }

}
