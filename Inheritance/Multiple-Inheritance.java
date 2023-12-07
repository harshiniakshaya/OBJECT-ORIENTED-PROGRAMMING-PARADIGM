import java.util.*;
interface area{
    void calculate_area(double x, double y);
}
interface perimeter{
    void calculate_perimeter(double x, double y);
}
class Shape implements area,perimeter{
    public void calculate_area(double x, double y){
        System.out.println("AREA="+x*y);
    }
    public void calculate_perimeter(double x, double y){
        System.out.println("PERIMETER="+(2*(x+y)));
    }
}
class Main{
    public static void main(String[] args){
        Shape s = new Shape();
        s.calculate_area(10,10);
        s.calculate_perimeter(10,10);
    }
}
/*
OUTPUT:
AREA=100.0
PERIMETER=40.0
*/
