package com.example.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.example.model.Book;
import com.example.model.BookModel;
import com.example.view.AddView;

public class AddViewController {
private static AddViewController avc;
private AddView av= AddView.getInstance();
private AddViewController(){
    setAddBookActionListener(av.getAddButton());
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
            String title = av.getTitle().getText();
            String author = av.getAuthor().getText();
            String genere = av.getGenere().getText();
            int quantity = Integer.parseInt(av.getQuantity().getText());
            double depositAmount = Double.parseDouble(av.getDepositAmount().getText());
            double rentalCost = Double.parseDouble(av.getRentalCost().getText());
            Book book=new Book(quantity, title, author, genere, quantity, depositAmount, rentalCost);
            BookModel bm=BookModel.getInstance();
            bm.addBook(book);
            System.out.println("Добавляем книгу: " + book); // Для отладки
            }
        });
    }



    
}
