package com.example.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.example.factory.view.UpdateAddViewFactory;
import com.example.factory.view.ViewFactory;
import com.example.model.Book;
import com.example.model.BookModel;
import com.example.view.AddView;
import com.example.view.UpdateAddView;
import com.example.view.View;
public class AddViewController implements Controller {
private static AddViewController avc;
private ViewFactory viewFactory;
private View updateAddView;
private AddViewController(){
    viewFactory=UpdateAddViewFactory.getInstance();
    updateAddView= viewFactory.create();
}
public static AddViewController getInstance(){
    if(avc==null){
        avc=new AddViewController();
    }
    return avc;
}
public  void setActionListener(JButton button){
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
