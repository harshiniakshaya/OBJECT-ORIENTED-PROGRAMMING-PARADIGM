/*
Get the input String from user and parse it to integer, if it is not a
number it will throw number format exception Catch it and print
"Entered input is not a valid format for an integer." or else print the
square of that number. (Refer Sample Input and Output).
Sample input and output 1:
Enter an integer: 12
The square value is 144
The work has been done successfully
Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.
*/
/*
A NumberFormatException is thrown when you try to convert a string into a numeric format (like int or double), but the string does not represent a valid number. 
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            String str=s.nextLine();
            int n = Integer.parseInt(str);
            System.out.println("Square value: "+n*n);
        }
        catch(NumberFormatException e){
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
/*
SAMPLE INPUT AND OUTPUT:
hello
Entered input is not a valid format for an integer.
----------
25
Square value: 625
*/
