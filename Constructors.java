/*
--Test using Online GDB--
PROBLEM STATEMENT:
implement a simple Java class called "Student" to represent a student
object. The "Student" class should have the following attributes:
name, age, and rollNumber. You need to implement two constructors
and a method that utilizes the this keyword.
Constructor 1: A parameterized constructor that takes the name, age,
and rollNumber as arguments and initializes the corresponding
attributes using the this keyword.
Constructor 2: A default constructor that sets the name to
"Unknown", age to 0, and rollNumber to -1.
Method: A method named displayInfo() that displays the details of
the student, including their name, age, and roll number.
Implement the "Student" class based on the problem statement.
*/
import java.util.*;
class Student{
    String name;
    int age;
    int roll;
    public Student(){ // DEFAULT CONSTRUCTOR
        this.name="unknown";
        this.age=0;
        this.roll=-1;
    }
    public Student(String n, int a, int r){ // PARAMETERIZED CONSTRUCTOR
        this.name=n;
        this.age=a;
        this.roll=r;
    }
    public Student(Student copy_student){ //COPY CONSTRUCTOR
        this.name=copy_student.name;
        this.age=copy_student.age;
        this.roll=copy_student.roll;
    }
    public void DisplayInfo(){
        System.out.println("Student's name:"+this.name);
        System.out.println("Student's age:"+this.age);
        System.out.println("Student's rollnumber:"+this.roll);
    }
    
}
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("enter student's name:");
        String name=s.nextLine();
        System.out.print("enter student's age:");
        int age=s.nextInt();
        System.out.print("enter student's roll_number:");
        int roll=s.nextInt();
        Student s2 = new Student(name,age,roll);
        System.out.println("STUDENT 1- DETAILS");
        s1.DisplayInfo();
        System.out.println("STUDENT 2- DETAILS");
        s2.DisplayInfo();
        Student s3= new Student(s2);
        System.out.println("STUDENT 3- DETAILS");
        s3.DisplayInfo();
    }
}
/*
SAMPLE INPUT AND OUTPUT:
enter student's name:harshini
enter student's age:18
enter student's roll_number:123
STUDENT 1- DETAILS
Student's name:unknown
Student's age:0
Student's rollnumber:-1
STUDENT 2- DETAILS
Student's name:harshini
Student's age:18
Student's rollnumber:123
STUDENT 3- DETAILS
Student's name:harshini
Student's age:18
Student's rollnumber:123
*/
