package com.example.model;
import com.example.controller.MainViewController;
import com.example.model.repository.*;
public class BookModel implements Observable{
private Book_rep_DB db= Book_rep_DB.getInstance();
    BookModel(){
        // addObserver();
    }
    public  void addBook(Book book){
        db.addBook(book);
        
    }
}
