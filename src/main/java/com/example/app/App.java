package com.example.app;

import java.util.*;



import javax.swing.JFrame;

import com.example.controller.MainViewController;
import com.example.model.Book;
import com.example.model.ShortBook;
import com.example.model.repository.Book_rep_DB;
import com.example.view.MainView;


public class App {
    public static void main(String[] args) {

         MainView mv= MainView.getInstance();
         MainViewController mvc= MainViewController.getInstance(mv);


         mv.openFrame();
        //Book_rep_DB db=Book_rep_DB.getInstance();
        // for (int i=0; i<40; i++) {
            // db.addBook(new com.example.model.Book(i,"Book "+i,"Author ","Genere ",100,100.0,20.0));
        // }
       // db.addBook(new com.example.model.Book(1,"Book "+1,"Author ","Genere ",100,100.0,20.0));
        // for (int i=0; i<=100; i++) {
        //     db.deleteBookById(i);
        // }
        // try{
        // List<ShortBook> books = db.get_k_n_shortList(0,20);
        // for (ShortBook book : books) {
        //     System.out.println(book);
        // }
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
    }
}
