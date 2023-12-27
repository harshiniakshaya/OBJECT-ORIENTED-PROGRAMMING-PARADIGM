/*
Given a string, return a new string made of 'n' copies of the first 2 chars of
the original string where 'n' is the length of the string.
Example1)
i/p:Wipro
o/p:WiWiWiWiWi
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuffer sb = new StringBuffer();
        String sub = str.substring(0,2);
        for(int i=0;i<str.length();i++){
            sb.append(sub);
        }
        System.out.println(sb);
    }
}
/*
OUTPUT:
Wipro
WiWiWiWiWi
*/
