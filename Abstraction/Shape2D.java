import java.util.*;
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Rectangle is drawn successfully!");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle is drawn successfully!");
    }
}
public class Main{
    public static void main(String[] args){
        Shape r = new Rectangle();
        r.draw();
        Shape c = new Circle();
        c.draw();
    }
}
/*
OUTPUT:
Rectangle is drawn successfully!
Circle is drawn successfully!
*/
