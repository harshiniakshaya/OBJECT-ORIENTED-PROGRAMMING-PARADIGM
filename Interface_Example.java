// A BASIC EXAMPLE TO UNDERSTAND INTERFACE
import java.util.*;
interface Shape{
    void calculateArea(float l,float b);
    void calculatePerimeter(float l,float b);
}
class Rectangle implements Shape{
    public Rectangle(float l,float b){
        calculateArea(l,b);
        calculatePerimeter(l,b);
    }
    public void calculateArea(float l,float b){
        System.out.println("Area="+l*b);
    }
    public void calculatePerimeter(float l,float b){
        System.out.println("Perimeter="+(2*(l+b)));
    }
}
class Square implements Shape{
    public Square(float l,float b){
        calculateArea(l,b);
        calculatePerimeter(l,b);
    }
    public void calculateArea(float l,float b){
        System.out.println("Area="+l*b);
    }
    public void calculatePerimeter(float l,float b){
        System.out.println("Perimeter="+(2*(l+b)));
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Rectangle:");
        System.out.print("enter length:");
        float l = s.nextFloat();
        System.out.print("enter width:");
        float w= s.nextFloat();
        Shape r = new Rectangle(l,w);
        
        System.out.println("Square:");
        System.out.print("enter side length:");
        float a = s.nextFloat();
        Shape sq = new Square(a,a);
    }
}
/*
SAMPLE INPUT AND OUTPUT:
Rectangle:
enter length:10
enter width:20
Area=200.0
Perimeter=60.0
Square:
enter side length:10
Area=100.0
Perimeter=40.0
*/
