/*
Write a Java program to create a base class Animal with methods move()
and makeSound(). Create two subclasses Bird and Panthera. Override the
move() method in each subclass to describe how each animal moves. Also,
override the makeSound() method in each subclass to make a specific sound
for each animal.
*/
class Animal{
    public void move(){
        System.out.println("This method is used to describe how each animal moves.");
    }
    public void makeSound(){
        System.out.println("This method is used to describe the animal's sound");
    }
}
class Bird extends Animal{
    public void move(){
        System.out.println("Birds fly!");
    }
    public void makeSound(){
        System.out.println("Birds chirp!");
    }
}
class Panthera extends Animal{
    public void move(){
        System.out.println("Panthera moves like a mammal!");
    }
    public void makeSound(){
        System.out.println("Panthera roars!");
    }
}
public class Main{
    public static void main(String[] args){
        Bird b1= new Bird();
        b1.move();
        b1.makeSound();
        Panthera p1= new Panthera();
        p1.move();
        p1.makeSound();
    }
}
/*
OUTPUT:
Birds fly!
Birds chirp!
Panthera moves like a mammal!
Panthera roars!
*/
