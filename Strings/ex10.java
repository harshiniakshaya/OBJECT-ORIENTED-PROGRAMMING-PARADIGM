/*
String should contain only the words are not palindrome.
Sample Input 1
Malayalam is my mother tongue
Sample Output 1
is my mother tongue
*/
// StringBuffer reverse() will change the original StringBuffer sb
 java.util.*;
public class Main{
    public static StringBuffer reverse(StringBuffer sb){
        StringBuffer s1 = new StringBuffer(sb);
        return s1.reverse();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] a = str.split(" ");
        StringBuffer sb;
        StringBuffer rev;
        for(int i=0;i<a.length;i++){
            sb = new StringBuffer(a[i]);
            rev = reverse(sb);
            //System.out.println(sb+" "+rev);
            if(!sb.toString().equalsIgnoreCase(rev.toString())){
                System.out.print(sb+" ");
            }
            sb = new StringBuffer();
            rev = new StringBuffer();
        }
    }
}
/*
OUTPUT:
Malayalam is my mother tongue
is my mother tongue 
*/
