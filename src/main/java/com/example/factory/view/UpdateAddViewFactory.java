package com.example.factory.view;
import com.example.view.View;
import com.example.view.UpdateAddView;
public class UpdateAddViewFactory implements ViewFactory {
    private static UpdateAddViewFactory updateAddViewFactory;
    private UpdateAddViewFactory(){

    } 
    @Override  
    public View create(){
        return UpdateAddView.getInstance();
    }
    public static UpdateAddViewFactory getInstance(){
        if(updateAddViewFactory==null){
            updateAddViewFactory=new UpdateAddViewFactory();
        }
        return updateAddViewFactory;
    }
}
