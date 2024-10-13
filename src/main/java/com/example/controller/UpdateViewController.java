package com.example.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.example.model.Book;
import com.example.model.BookModel;
import com.example.view.UpdateView;
import com.example.view.MainView;
public class UpdateViewController {
    private static UpdateViewController uvc;
    private UpdateView uv= UpdateView.getInstance();
    private MainView mv= MainView.getInstance();
    private UpdateViewController(){
        setUpdateBookActionListener(uv.getButton());
    }
    public static UpdateViewController getInstance(){
        if(uvc==null){
            uvc=new UpdateViewController();
        }
        return uvc;
    }
    public  void setUpdateBookActionListener(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringBook="";
                int id;
                try{
                stringBook=mv.getJlist().getSelectedValue();
                // Найдем индекс начала и конца значения id
                int idStart = stringBook.indexOf("id='") + 4;  // 4 символа после "id='"
                int idEnd = stringBook.indexOf("'", idStart);  // Найдем следующую одинарную кавычку после id

                // Извлекаем значение id
                id=Integer.parseInt(stringBook.substring(idStart, idEnd));
                
                }catch(Exception err){
                    JOptionPane.showMessageDialog(null, "Выберите книгу из списка!");
                    uv.getFrame().dispose();
                    return;
                }
                String title =uv.getTitle().getText();
                String author = uv.getAuthor().getText();
                String genere = uv.getGenere().getText();
                int quantity = Integer.parseInt(uv.getQuantity().getText());
                double depositAmount = Double.parseDouble(uv.getDepositAmount().getText());
                double rentalCost=Double.parseDouble(uv.getRentalCost().getText());
                Book book=new Book(id,title,author,genere,quantity,depositAmount,rentalCost);
                BookModel bm=BookModel.getInstance();
                bm.updateBookById(id, book);
            }
        });
    
    }
}
