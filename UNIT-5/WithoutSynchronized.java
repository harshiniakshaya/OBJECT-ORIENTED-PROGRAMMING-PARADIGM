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
    //synchronized 
    public void run() {
        for (int i = 1; i < 6; i++) {
            int result = super.Mul(i);
            System.out.println(i + "x" + num + "=" + result);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = s.nextInt();
        System.out.print("Enter a number: ");
        int num2 = s.nextInt();
        PrintTable obj1 = new PrintTable(num1);
        Thread t1= new Thread(obj1);
        PrintTable obj2 = new PrintTable(num2);
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();
    }
}
/*
OUTPUT:
Enter a number: 5
Enter a number: 6
1x6=6
1x5=5
2x6=12
2x5=10
3x6=18
3x5=15
4x6=24
4x5=20
5x6=30
5x5=25
*/
