package com.example.test.factory;
import com.example.test.*;
public class CppDevFactory implements DevFactory {
    @Override
    public Dev createInstance() {
        System.out.println("Creating Cpp Dev");
        return new CppDev();
    }
    
}
