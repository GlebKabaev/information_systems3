package com.example.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.example.model.Book;
import com.example.model.BookModel;
import com.example.view.AddView;
import com.example.view.UpdateAddView;
public class AddViewController {
private static AddViewController avc;
private UpdateAddView updateAddView= UpdateAddView.getInstance();
private AddViewController(){
    setAddBookActionListener(updateAddView.getButton());
}
public static AddViewController getInstance(){
    if(avc==null){
        avc=new AddViewController();
    }
    return avc;
}
public  void setAddBookActionListener(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            String title = updateAddView.getTitle().getText();
            String author = updateAddView.getAuthor().getText();
            String genere = updateAddView.getGenere().getText();
            int quantity = Integer.parseInt(updateAddView.getQuantity().getText());
            double depositAmount = Double.parseDouble(updateAddView.getDepositAmount().getText());
            double rentalCost = Double.parseDouble(updateAddView.getRentalCost().getText());
            Book book=new Book(quantity, title, author, genere, quantity, depositAmount, rentalCost);
            BookModel bm=BookModel.getInstance();
            bm.addBook(book);
            
            }
        });
    }



    
}
