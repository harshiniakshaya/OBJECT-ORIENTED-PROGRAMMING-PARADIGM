/*
Write a java program to read one integer as mark and display the given
mark if it valid, otherwise “InvalidMarkException “has been thrown.
Note: “InvalidMarkException “ -> custom exception class, it will return
“The given mark is invalid”.
*/
import java.util.*;
class InvalidMarkException extends Exception{
    public InvalidMarkException(String msg){
        super(msg);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        try{
            int m=s.nextInt();
            if(m<0||m>100){
                throw new InvalidMarkException("Mark is Invalid");
            }
            else{
                System.out.println("Mark="+m);
            }
        }
        catch(InvalidMarkException e){
            System.out.println(e.getMessage());
        }
        finally{
            s.close();
        }
    }
}
/*
SAMPLE INPUT AND OUTPUT:
50
Mark=50
----------
200
Mark is Invalid
*/
