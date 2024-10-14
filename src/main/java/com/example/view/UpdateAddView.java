package com.example.view;


import javax.swing.*;
public class UpdateAddView {
    private static UpdateAddView updateAddView;
    private JFrame frame = new JFrame("");
    private JButton button = new JButton("Подтвердить");
    private JTextField title = new JTextField("введите title");
    private JTextField author = new JTextField("введите author");
    private JTextField genere = new JTextField("введите genere");
    private JTextField quantity = new JTextField("введите quantity");
    private JTextField depositAmount = new JTextField("введите depositAmount");
    private JTextField rentalCost = new JTextField("введите rentalCost");

    private UpdateAddView(){
        //frame
        frame.setSize(700, 700);
        frame.setLayout(null);
        // title
        title.setBounds(50, 50, 200, 30);
        frame.add(title);
        // author
        author.setBounds(50, 100, 200, 30);
        frame.add(author);
        // genere
        genere.setBounds(50, 150, 200, 30);
        frame.add(genere);
        // quantity
        quantity.setBounds(50, 200, 200, 30);
        frame.add(quantity);
        // depositAmount
        depositAmount.setBounds(50, 250, 200, 30);
        frame.add(depositAmount);
        // rentalCost
        rentalCost.setBounds(50, 300, 200, 30);
        frame.add(rentalCost);
        //button
        button.setBounds(260, 300, 200, 30);
        frame.add(button);
    }
    public void openFrame() {
        frame.setVisible(true);
    }
    //singleton
    public static UpdateAddView getInstance() {
        if(updateAddView==null){
            updateAddView= new UpdateAddView();
        }
        return updateAddView;
    }
    //getters
    public JFrame getFrame() {
        return frame;
    }
    public JTextField getTitle() {
        return title;
    }
    public JTextField getAuthor() {
        return author;
    }
    public JTextField getGenere() {
        return genere;
    }
    public JTextField getQuantity() {
        return quantity;
    }
    public JTextField getDepositAmount() {
        return depositAmount;
    }
    public JTextField getRentalCost() {
        return rentalCost;
    }
    public JButton getButton() {
        return button;
    }
    //setters
    public void setTitle(String title) {
        this.title.setText(title);
    }
    public void setAuthor(String author) {
        this.author.setText(author);
    }
    public void setGenere(String genere) {
        this.genere.setText(genere);
    }
    public void setQuantity(String quantity) {
        this.quantity.setText(quantity);
    }
    public void setDepositAmount(String depositAmount) {
        this.depositAmount.setText(depositAmount);
    }
    public void setRentalCost(String rentalCost) {
        this.rentalCost.setText(rentalCost);
    }
    public void setButton(JButton button) {
        this.button = button;
    }
}
