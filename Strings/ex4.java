/*
Write a java program that accepts a string and returns a new string without
the first and last character of the input string.
Example1)
i/p:Suman
o/p:uma
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str.substring(1,str.length()-1));
    }
}
/*
OUTPUT:
Suman
uma
----
Harshini
arshin
*/
