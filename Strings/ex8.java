/*
Given a string and an integer n, print a new string made of n repetitions of
the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
Example1)
i/p:Wipro,3
o/p:propropro
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = s.nextInt();
        String sub = str.substring(str.length()-n,str.length());
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n;i++){
            sb.append(sub);
        }
        System.out.println(sb);
    }
}
/*
OUTPUT:
Wipro
3
propropro
*/
