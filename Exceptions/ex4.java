/*
Write a program to accept name and age of a person from the command
prompt(passed as arguments when you execute the class) and ensure
that the age entered is >=18 and < 60. Display proper error messages.
The program must exit gracefully after displaying the error message in
case the arguments passed are not proper.
(Hint : Create a user defined exception class for handling errors.)
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

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            int ch;
            try{
                
                System.out.print("NAME: ");
                String n = s.nextLine();
                System.out.print("AGE: ");
                int a = s.nextInt();
                s.nextLine();
                if(a<0){
                    throw new NegativeValueException("Incorrecr Age(Age less than 0)!");
                }
                else if(a<18 || a>=60){
                    throw new OutOfRangeException("Invalid Age(Age should be >=18 or <60)");
                }
                else{
                    System.out.println("You are eligible to VOTE!");
                }
            }
            catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }
            catch(NegativeValueException e){
                System.out.println(e.getMessage());
            }
            catch(OutOfRangeException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Press 1-continue or 0-discontinue");
            ch = s.nextInt();
            s.nextLine();
            if(ch==0){
                break;
            }
        }
        
    }
}
/*
NAME: asd
AGE: 25
You are eligible to VOTE!
Press 1-continue or 0-discontinue
1
NAME: efg
AGE: 5
Invalid Age(Age should be >=18 or <60)
Press 1-continue or 0-discontinue
1
NAME: abc
AGE: 60
Invalid Age(Age should be >=18 or <60)
Press 1-continue or 0-discontinue
0
*/
