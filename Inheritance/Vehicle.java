/*
Write a Java program to create a vehicle class hierarchy. The base class
should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass
should have properties such as make, model, year, and fuel type. Implement
methods for calculating fuel efficiency, distance traveled, and maximum
speed.
*/
class Vehicle{
    String make;
    String model;
    int year;
    String fueltype;
    double fuel_eff; double dist_tr; double max_sp;
    public Vehicle(String ma, String mo, int y, String f){
        this.make=ma;
        this.model=mo;
        this.year=y;
        this.fueltype=f;
    }
    public double fueleffiency(double fuel_consumed, double dist){
        this.fuel_eff=fuel_consumed/dist;
        return fuel_consumed/dist;
    }
    public double dist_travelled(double speed,int time){
        this.dist_tr=speed*time;
        return speed*time;
    }
    public double set_maxspeed(double max){
        this.max_sp=max;
        return max;
    }
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fueltype);
    }
    public void travelInfo(){
        System.out.println("Fuel Efficiency: " + fuel_eff);
        System.out.println("Distance Travelled: " +dist_tr);
        System.out.println("Maximum Speed: " +max_sp);
    }
}
class Truck extends Vehicle{
    public Truck(String ma, String mo, int y, String f){
        super(ma,mo,y,f);
    }
}
class Car extends Vehicle{
    public Car(String ma, String mo, int y, String f){
        super(ma,mo,y,f);
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(String ma, String mo, int y, String f){
        super(ma,mo,y,f);
    }
}
public class Main{
    public static void main(String[] args){
        System.out.println("-----TRUCK-----");
        Truck t1= new Truck("Ford","ABC1",2015,"Diesel");
        t1.fueleffiency(100,200);
        t1.dist_travelled(25,15);
        t1.set_maxspeed(75);
        t1.displayInfo();
        t1.travelInfo();
        System.out.println("-----CAR-----");
        Car c1= new Car("Honda","123",2022,"Petrol");
        c1.displayInfo();
        System.out.println("-----MOTORCYCLE-----");
        Motorcycle m1= new Motorcycle("Royal Enfield","A56",2017,"Petrol");
        m1.displayInfo();
    }
}
/*
OUTPUT:
-----TRUCK-----
Make: Ford
Model: ABC1
Year: 2015
Fuel Type: Diesel
Fuel Efficiency: 0.5
Distance Travelled: 375.0
Maximum Speed: 75.0
-----CAR-----
Make: Honda
Model: 123
Year: 2022
Fuel Type: Petrol
-----MOTORCYCLE-----
Make: Royal Enfield
Model: A56
Year: 2017
Fuel Type: Petrol
*/
