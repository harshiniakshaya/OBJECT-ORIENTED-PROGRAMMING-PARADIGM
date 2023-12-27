/*
Given a string, if the first or last chars are 'x', return the string without
those 'x' chars, otherwise return the string unchanged.
If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        if(str.charAt(0)=='x' || str.charAt(l-1)=='x'){
            if(str.charAt(0)=='x' && str.charAt(l-1)!='x')
                System.out.println(str.substring(1,l));
            else if(str.charAt(0)!='x' && str.charAt(l-1)=='x')
                System.out.println(str.substring(0,l-1));
            else
                System.out.println(str.substring(1,l-1));
        }
        else{
            System.out.println(str);
        }
    }
}
/*
OUTPUT:
xHix
Hi
------
Americx
Americ
*/
    
