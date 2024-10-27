package com.example.model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.example.controller.MainViewController;
import com.example.repository.*;
public class BookModel implements Observable{
    private static BookModel bm;
    private Book_rep_DB db= Book_rep_DB.getInstance();

    public static BookModel getInstance(){
        if(bm==null){
            bm=new BookModel();
        }
        return bm;
    }
    private BookModel(){
        MainViewController mvc=MainViewController.getInstance();
        addObserver(mvc);
    }

    public  void addBook(Book book){
        db.addBook(book);
        
        notifyObservers();
    }
    public void updateBookById(int id,Book book){
        db.updateBookById(id, book);
        notifyObservers();
    }
    public void deleteBookById(int id){
        db.deleteBookById(id);
        notifyObservers();
    }
    public int getCount(){
        return db.getCount();
    }
    public Book getBookById(int id){
        return db.getBookById(id);
    }
    public ShortBook getShortBookById(int id){
        return db.getShortBookById(id);
    }
    public List<ShortBook> get_k_n_shortList(int k, int n){
        try {
            return db.get_k_n_shortList(k, n);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<ShortBook>();
    }
}
