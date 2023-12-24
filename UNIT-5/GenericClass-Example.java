import java.util.*;
class GenericClass <T,V>{
    T name;
    V roll;
    public GenericClass(T n, V r){
        this.name=n;
        this.roll=r;
    }
    public T getname(){
        return name;
    }
    public V getroll(){
        return roll;
    }
}
public class Main{
    public static void main(String[] args){
        System.out.println("--OUTPUT 1--");
        GenericClass<String,Integer> student = new GenericClass<>("harshini",12345);
        System.out.println("Name: "+student.getname());
        System.out.println("Roll: "+student.getroll());
        
        System.out.println("--OUTPUT 2--");
        GenericClass<String,Double> shop = new GenericClass<>("Onion",87.6);
        System.out.println("Vegetable: "+shop.getname());
        System.out.println("Price: "+shop.getroll());
    }
}
/*
--OUTPUT 1--
Name: harshini
Roll: 12345
--OUTPUT 2--
Vegetable: Onion
Price: 87.6
*/
