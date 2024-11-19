package com.example.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.example.model.Book;
import com.example.model.BookModel;
import com.example.view.UpdateAddView;
import com.example.view.MainView;
public class UpdateViewController implements Controller {
    private static UpdateViewController uvc;
    private UpdateAddView updateAddView= UpdateAddView.getInstance();
    private MainView mv= MainView.getInstance();
    private UpdateViewController(){
        //setUpdateBookActionListener(updateAddView.getButton());
    }
    public static UpdateViewController getInstance(){
        if(uvc==null){
            uvc=new UpdateViewController();
        }
        return uvc;
    }
    public  void setActionListener(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String stringBook="";
                int id;
                BookModel bm=BookModel.getInstance();
               
                try{
                stringBook=mv.getJlist().getSelectedValue();
                // Найдем индекс начала и конца значения id
                int idStart = stringBook.indexOf("id='") + 4;  // 4 символа после "id='"
                int idEnd = stringBook.indexOf("'", idStart);  // Найдем следующую одинарную кавычку после id 
                // Извлекаем значение id
                id=Integer.parseInt(stringBook.substring(idStart, idEnd));
                
                }catch(Exception err){
                    JOptionPane.showMessageDialog(null, "Выберите книгу из списка!");
                    updateAddView.getFrame().dispose();
                    return;
                }
                String title =updateAddView.getTitle().getText();
                String author = updateAddView.getAuthor().getText();
                String genre = updateAddView.getGenre().getText();
                int quantity = Integer.parseInt(updateAddView.getQuantity().getText());
                double depositAmount = Double.parseDouble(updateAddView.getDepositAmount().getText());
                double rentalCost=Double.parseDouble(updateAddView.getRentalCost().getText());
                Book book=new Book(id,title,author,genre,quantity,depositAmount,rentalCost);
                
                bm.updateBookById(id, book);
            }
        });
    
    }
}
