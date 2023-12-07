// MULTILEVEL INHERITANCE
class A {
    void methodA() {
        System.out.println("methodA() is called.");
    }
}
class B extends A {
    void methodB() {
        System.out.println("methodB() is called.");
    }
}
class C extends B {
    void methodC() {
        System.out.println("methodC() is called.");
    }
}
public class Main {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.methodA();
        obj1.methodB();
        obj1.methodC();
    }
}
/*
methodA() is called.
methodB() is called.
methodC() is called.
*/
