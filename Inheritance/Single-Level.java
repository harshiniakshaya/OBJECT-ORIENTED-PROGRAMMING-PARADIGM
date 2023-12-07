// SINGLE LEVEL INHERITANCE
import java.util.*;
class A{
    void methodA(){
        System.out.println("methodA() is called.");
    }
}
class B extends A{
    void methodB(){
        System.out.println("methodB() is called.");
    }
}
public class Main{
    public static void main(String[] args){
        B obj1= new B();
        obj1.methodA();
        obj1.methodB();
        
    }
}
/*
OUTPUT:
methodA() is called.
methodB() is called.
*/
