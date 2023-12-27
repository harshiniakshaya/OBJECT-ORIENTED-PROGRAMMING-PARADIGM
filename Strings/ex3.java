/*
Write a java program that will return the first half of the string, if the length
of the string is even. It should return null for odd length string.
Example1)
i/p:TomCat
o/p:Tom
Example2)
i/p:Apron
o/p:null
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        if(l%2==0){
            System.out.println(str.substring(0,l/2));
        }
        else{
            System.out.println("null");
        }
    }
}
/*
OUTPUT:
TomCat
Tom
-----
Apron
null
*/
    
