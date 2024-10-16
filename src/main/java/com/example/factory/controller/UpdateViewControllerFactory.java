package com.example.factory.controller;
import com.example.controller.UpdateViewController;
import com.example.controller.Controller;
public class UpdateViewControllerFactory implements ControllerFactory{
    private static UpdateViewControllerFactory updateViewControllerFactory;
    private UpdateViewControllerFactory(){

    }
    @Override 
    public Controller create(){
        return UpdateViewController.getInstance();
    }
    public static UpdateViewControllerFactory getInstance(){
        if(updateViewControllerFactory==null){
            updateViewControllerFactory=new UpdateViewControllerFactory();
        }
        return updateViewControllerFactory;
    }  
}
