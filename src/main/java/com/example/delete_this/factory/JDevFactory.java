package com.example.delete_this.factory;
import com.example.delete_this.*;
public class JDevFactory implements DevFactory {
    public Dev createInstance(){
        System.out.println("Creating Jdev");
        return new JDev();
    }
    
}
