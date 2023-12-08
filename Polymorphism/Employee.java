/*
Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each
subclass, override the calculateSalary() method to calculate and return the
salary based on their specific roles.
*/
class Employee{
    double salary=10000;
    public double calculateSalary(){
        return salary;
    }
    public void changeSalary(double sal){
        this.salary=sal;
    }
    public void printSalary(){
        System.out.println(this.getClass().getName()+" SALARY = "+salary);
    }
}
class Programmer extends Employee{
    public double calculateSalary(){
        double sal = super.calculateSalary()+0.25*(super.calculateSalary());
        super.changeSalary(sal);
        super.printSalary();
        return sal;
    } 
}
class Manager extends Employee{
    public double calculateSalary(){
        double sal = super.calculateSalary()+0.5*(super.calculateSalary());
        super.changeSalary(sal);
        super.printSalary();
        return sal;
    }
}
public class Main{
    public static void main(String[] args){
        Programmer p1 = new Programmer();
        p1.calculateSalary();
        Manager m1 = new Manager();
        m1.calculateSalary();
    }
}
/*
Programmer SALARY = 12500.0
Manager SALARY = 15000.0
*/
