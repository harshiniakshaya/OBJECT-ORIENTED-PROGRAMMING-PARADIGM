/*
Write a java program that will concatenate 2 strings and return the result.
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the
characters need to be omitted.
Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar
Example2)
i/p:Mark,kate
o/p:markate
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        String[] a = str.split(",");
        StringBuffer sb = new StringBuffer();
        if(a[0].charAt(a[0].length()-1)==a[1].charAt(0)){
            for(int i=0;i<a[0].length();i++){
                sb.append(a[0].charAt(i));
            }
            for(int i=1;i<a[1].length();i++){
                sb.append(a[1].charAt(i));
            }
        }
        else{
            for(int i=0;i<a[0].length();i++){
                sb.append(a[0].charAt(i));
            }
            sb.append(" ");
            for(int i=0;i<a[1].length();i++){
                sb.append(a[1].charAt(i));
            }
        }
        String strnew= new String(sb);
        System.out.println(strnew.toLowerCase());
    }
}
/*
OUTPUT
Sachin,Tendulkar
sachin tendulkar
-----------
Mark,kate
markate
*/
