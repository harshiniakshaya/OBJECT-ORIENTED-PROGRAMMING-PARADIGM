//Array Index Out Of Bounds Exception
/*
Write a program that takes as input the size of the array and the
elements in the array. The program then asks the user to enter a
particular index and prints the element at that index. This program
may generate Array Index Out Of Bounds Exception. Use exception
handling mechanisms to handle this exception. In the catch block,
print the class name of the exception thrown.
Sample Input and Output 1:
Enter the number of elements in the array 3
Enter the elements in the array 20 90 4
Enter the index of the array element you want to access 2
The array element at index 2 = 4
The array element successfully accessed
Sample Input and Output 2:
Enter the number of elements in the array 3
Enter the elements in the array 20 90 4
Enter the index of the array element you want to access 6
java.lang.ArrayIndexOutOfBoundsException
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            System.out.print("enter index:");
            int index=s.nextInt();
            System.out.println("array element="+a[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            //System.out.println("Eneter a valid index!");
            System.out.println(e.getClass().getName());
        }
    }
}
/*
SAMPLE INPUT AND OUTPUT:
3
20 90 4
enter index:6
java.lang.ArrayIndexOutOfBoundsException
----------
5
10 20 30 40 50
enter index:2
array element=30
*/
