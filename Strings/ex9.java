/*
Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.
Sample Input 1
thistest123string
123
Sample Output 1
8
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String sub = s.nextLine();
        int n = str.indexOf(sub);
        System.out.println(n);
    }
}
/*
OUTPUT:
thistest123string
123
8
------
HELLO
123
-1
*/
