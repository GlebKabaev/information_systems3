package com.example.delete_this.factory;
import com.example.delete_this.*;
public class CppDevFactory implements DevFactory {
    @Override
    public Dev createInstance() {
        System.out.println("Creating Cpp Dev");
        return new CppDev();
    }
    
}
