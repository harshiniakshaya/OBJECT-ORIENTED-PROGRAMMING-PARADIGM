/*
--Test using Online GDB--
Problem Statement:
Create a Java class called "Student" with private attributes for the
student's name and age. Implement public methods to set the values
of these attributes and display the student's information.
*/
import java.util.*;
class Student{
    private String name;
    private int age;
    /*public Student(String n, int a){
        this.name=n;
        this.age=a;
    }*/
    public void Set_Sname(String n){
        this.name=n;
    }
    public void Set_Sage(int a){
        this.age=a;
    }
    public void Display_Sinfo(){
        System.out.println("Student's name:"+this.name);
        System.out.println("Student's age:"+this.age);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter student's name:");
        String name=s.nextLine();
        System.out.println("enter student's age:");
        int age=s.nextInt();
        Student s1= new Student();
        s1.Set_Sname(name);
        s1.Set_Sage(age);
        s1.Display_Sinfo();
    }
}
/*
SAMPLE INPUT AND OUTPUT:
enter student's name:
harshini
enter student's age:
18
Student's name:harshini
Student's age:18
*/
