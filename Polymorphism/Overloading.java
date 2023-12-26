import java.util.*;
class Add{
    //int a; int b; int c; int d;
    int res;
    
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b, int c, int d){
        //Different number of parameters.
        return a+b+c+d;
    }
    public double add (double a, double b){
        //Different types of parameters.
        return a+b;
    }
}
public class Main
{
	public static void main(String[] args) {
		Add a1 = new Add();
		Add a2 = new Add();
		Add a3 = new Add();
		Add a4 = new Add();
		System.out.println(a1.add(1,2));
		System.out.println(a2.add(1,2,3));
		System.out.println(a3.add(1,2,3,4));
		System.out.println(a4.add(1.4,2.3));
	}
}
/*
OUTPUT:
3
6
10
3.6999999999999997
*/
