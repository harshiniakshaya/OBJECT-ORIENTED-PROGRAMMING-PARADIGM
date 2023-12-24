/*
Thread implementation even when extending a class - Runnable Interface.
Note: We cannot extend other classes when we are extending thread class as Java does not support multiple inheritance..so there is an interface called "Runnable" interface which can be used to implement multithreading.
Thread class - has both start and run inbuilt methods'
Runnable interface - has only run method, so a thread object (t1) is created whose paramater is the object of the implemented class(obj of PrintTable class). 
t1<--obj
t1-->gets started
*/
import java.util.*;
class Multiplication{
    int num;
    public Multiplication(int n){
        this.num=n;
    }
    public int Mul(int i){
        return i*num;
    }
}
class PrintTable extends Multiplication implements Runnable{
    public PrintTable(int n){
        super(n);
    }
    public void run() {
        for (int i = 1; i < 6; i++) {
            int result = super.Mul(i);
            System.out.println(i + "x" + num + "=" + result);
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        PrintTable obj = new PrintTable(num);
        Thread t1= new Thread(obj);
        t1.start();
    }
}
/*
Enter a number: 5
1x5=5
2x5=10
3x5=15
4x5=20
5x5=25
*/
