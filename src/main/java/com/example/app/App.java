package com.example.app;

// import java.util.*;



// import javax.swing.JFrame;

import com.example.controller.AddViewController;
import com.example.controller.MainViewController;
import com.example.controller.UpdateViewController;
// import com.example.model.Book;
// import com.example.model.BookModel;
// import com.example.model.ShortBook;
// import com.example.model.repository.Book_rep_DB;
import com.example.view.AddView;
import com.example.view.MainView;
import com.example.view.UpdateView;


public class App {
    public static void main(String[] args) {

        MainView mv= MainView.getInstance();
        AddView av = AddView.getInstance();
        UpdateView uv= UpdateView.getInstance();
        MainViewController mvc= MainViewController.getInstance();
        AddViewController avc= AddViewController.getInstance();
        UpdateViewController uvc= UpdateViewController.getInstance();


        mv.openFrame();



        // Book_rep_DB db=Book_rep_DB.getInstance();
        // for (int i=0; i<40; i++) {
            // db.addBook(new com.example.model.Book(i,"Book "+i,"Author ","Genere ",100,100.0,20.0));
        // }
    //    db.addBook(new com.example.model.Book(1,"Book "+1,"Author ","Genere ",100,100.0,20.0));
        // for (int i=1; i<=200; i++) {
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
