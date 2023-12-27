/*
Write a Java program that accepts a string (with * in it). The program
should return a new string in which the following characters are removed-
*,the characters that are to the left and right of *
Example1)
i/p:ab*cd
o/p:ad
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n= str.indexOf("*");
        if(n!=-1){
            System.out.println(str.substring(0,n-1)+str.substring(n+2,str.length()));    
        }
    }
}
/*
OUTPUT:
ab*cd
ad
--------------
ABCD*EFGH
ABCFGH
*/

