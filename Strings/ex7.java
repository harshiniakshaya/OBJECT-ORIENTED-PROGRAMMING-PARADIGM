/*
Given two strings, a and b, print a new string which is made of the following
combination-first character of a, the first character of b, second character of
a, second character of b and so on.
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
*/
/*
note: Any characters left out , will get appended to the end of the result.
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] a = str.split(",");
        StringBuffer sb = new StringBuffer(a[0]);
        int c =0;
        for(int i=0;i<str.length()-1;i++){
            if(i%2!=0&&c<a[1].length()){
                sb.insert(i,a[1].charAt(c));
                c++;
            }
        }
        if(a[1].length()>a[0].length()){
            sb.append(a[1].substring(a[1].length()-a[0].length()+1,a[1].length()));
        }
        System.out.println(sb);
    }
}
/*
OUTPUT:
Hello,World
HWeolrllod
-------
Hello,abc
Haeblclo
--------
hi,abc
haibc
*/
