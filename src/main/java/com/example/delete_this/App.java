package com.example.delete_this;
import com.example.delete_this.factory.*;;
public class App {
    public static void main(String[] args) {
        DevFactory factory = new JDevFactory();
        Dev dev = factory.createInstance();
        dev.writeCode();
        
        
    }
    // static DevFactory createDevFactoryBySpec(String spec){
    //     switch(spec){
    //         case "cpp":
    //             return new CppDevFactory();
    //         case "java":
    //             return new JavaDevFactory();
    //         default:
    //             throw new IllegalArgumentException("Invalid developer specification");
    //     }
    // }
}
    
