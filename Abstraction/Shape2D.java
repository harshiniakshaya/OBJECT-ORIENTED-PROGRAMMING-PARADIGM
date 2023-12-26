/*
Write a Java program to create an abstract class Shape2D with abstract
methods draw(). Create subclasses Rectangle and Circle that
extend the Shape2D class and implement the respective methods to draw shape.
*/
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
