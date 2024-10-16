package com.example.factory.controller;

import com.example.controller.*;
public class AddViewControllerFactory implements ControllerFactory {
    private static AddViewControllerFactory addViewControllerFactory;
    private AddViewControllerFactory(){

    }
    @Override
    public Controller create(){
        return  AddViewController.getInstance();
    }
    public static AddViewControllerFactory getInstance(){
        if(addViewControllerFactory==null){
            addViewControllerFactory=new AddViewControllerFactory();
        }
        return addViewControllerFactory;
    }
}
