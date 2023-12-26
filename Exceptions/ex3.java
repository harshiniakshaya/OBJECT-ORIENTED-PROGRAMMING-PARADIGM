/*
Write a Program to take care of Number Format Exception if user
enters values other than integer for calculating average marks of 2
students. The name of the students and marks in 3 subjects are taken
from the user while executing the program. In the same Program write
your own Exception classes to take care of Negative values and values
out of range (i.e. other than in the range of 0-100).
*/
import java.util.*;
class NegativeValueException extends Exception{
    public NegativeValueException(String msg){
        super(msg);
    }
}
class OutOfRangeException extends Exception{
    public OutOfRangeException(String msg){
        super(msg);
    }
}
class Student{
    String name;
    int m1,m2,m3;
    public Student(String n, int m1, int m2, int m3){
        this.name=n;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public double calcAvg() throws NegativeValueException, OutOfRangeException{
        if(m1<0||m2<0||m3<0){
            throw new NegativeValueException("Invalid Mark!");
        }
        else if(m1>100||m2>100||m3>100){
            throw new OutOfRangeException("Mark is out of range!");
        }
        else{
            return (m1+m2+m3)/3;
        }
    }
}
public class Main{
    public static void main(String[] args) throws NegativeValueException, OutOfRangeException {
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("Student name:");
            String name=s.nextLine();
            System.out.print("Mark 1:");
            int m1=s.nextInt();
            System.out.print("Mark 2:");
            int m2=s.nextInt();
            System.out.print("Mark 3:");
            int m3=s.nextInt();
            Student s1 = new Student(name,m1,m2,m3);
            System.out.println(s1.calcAvg());
        }
        catch(InputMismatchException e){
            System.out.println("Invalid mark,enter mark as an inetger!");
        }
        catch(NegativeValueException e){
            System.out.println(e.getMessage());
        }
        catch(OutOfRangeException e){
            System.out.println(e.getMessage());
        }
        
    }
}
/*
SAMPLE INPUT AND OUTPUT:
Student name:harshini
Mark 1:50
Mark 2:75
Mark 3:10
45.0
----------
Student name:harshini
Mark 1:50
Mark 2:175
Mark 3:56
Mark is out of range!
----------
Student name:harshini
Mark 1:50
Mark 2:75
Mark 3:-10
Invalid Mark!
*/
