package com.example.test.factory;
import com.example.test.*;
public class JDevFactory implements DevFactory {
    public Dev createInstance(){
        System.out.println("Creating Jdev");
        return new JDev();
    }
    
}
