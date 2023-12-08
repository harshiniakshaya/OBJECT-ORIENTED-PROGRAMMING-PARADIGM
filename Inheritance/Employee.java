/*
Write a Java program to create a class called Employee with methods called
work() and getSalary(). Create a subclass called HRManager that overrides
the work() method and adds a new method called addEmployee().
*/
class Employee{
    double salary;
    public Employee(double sal){
        this.salary=sal;
    }
    public void work(){
        System.out.println("The work is assigned to all the employees!");
    }
    public double getSalary(){
        return salary;
    }
}
class HRManager extends Employee{
    String name;
    public HRManager(double sal){
        super(sal);
    }
    public void work(){
        System.out.println("The work is assigned to HR.");
    }
    public void addEmployee(String name){
        System.out.println(name+" is now a HR in the Organisation");
    }
}
public class Main{
    public static void main(String[] args){
        Employee e1 = new Employee(10000);
        HRManager e2= new HRManager(15000);
        System.out.println("e1 salary:"+e1.getSalary());
        e2.addEmployee("harshini");
        System.out.println("e2 salary:"+e2.getSalary());
    }
}
/*
OUTPUT:
e1 salary:10000.0
harshini is now a HR in the Organisation
e2 salary:15000.0
*/
