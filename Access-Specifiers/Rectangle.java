/*
--Test it using ONLINE GDB--
Problem Statement:
Create a Java class called "Rectangle" with two private attributes,
"length" and "width." Implement public methods to set the values of
these attributes and calculate the area of the rectangle. Provide a
constructor to initialize the length and width of the rectangle.
*/
import java.util.*;
class Rectangle{
    private double length;
    private double width;
    public Rectangle(double l, double w){
        this.length=l;
        this.width=w;
    }
    public double Calculate_Area(){
        double area=length*width;
        return area;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double len; double wid;
        System.out.println("Enter length:");
        len=s.nextDouble();
        System.out.println("Enter width:");
        wid=s.nextDouble();
        Rectangle r1=new Rectangle(len,wid);
        System.out.println("Area = "+r1.Calculate_Area());
    }
}
/*
SAMPLE INPUT & OUTPUT:
Enter length:
50
Enter width:
50
Area = 2500.0
*/
