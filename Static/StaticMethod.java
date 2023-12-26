//Static methods do not need an instance of its class for being accessed
//main() method is the most common example of static method
public class Main
{
    public static int SquareGen(int x){
        return x*x;
    }
	public static void main(String[] args) {
		System.out.println(SquareGen(5));
		System.out.println(SquareGen(10));
	}
}
/*
25
100
*/
