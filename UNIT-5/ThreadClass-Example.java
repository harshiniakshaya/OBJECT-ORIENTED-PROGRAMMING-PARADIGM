/*
METHODS USED IN THE PROGRAM :-
--extends Thread:
The class extends the 'Thread' class in order to implement the objects as individual threads.
NOTE:If a class extends the Thread class, then objects of that class are indeed threads. When you create an instance of such a class and start it, you're essentially starting a new thread of execution.
--Thread.sleep(milliseconds):
pauses the execution of the current thread for a specified number of milliseconds.
--<object>.start():
starts the execution of the thread.
The run() method of the thread is executed.
note: executes only the run() method present the class when the start is invoked.
--<object>.join():
When you call the join() method on a Thread object, the calling thread (often referred to as the "main" thread if called from the main() method) will pause and wait for the specified thread to finish its execution.
--<object>.isAlive()
returns a boolean value(true/false)
It is used to determine whether a thread is still alive or has completed its execution.
*/
class PrintAlpha extends Thread{
    //public void PrintAlphaMethod(){
    public void run() { // executed when start() is invoked
        int n=97;
        for(int i=0;i<5;i++){
                System.out.println((char)n);
                try{
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                
                n++;
        }
    }
}
class PrintNum extends Thread{
    //public void PrintNumMethod(){
    public void run(){ // executed when start() is invoked
        for(int i=1;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Main{
    public static void main(String[] args) throws Exception{
        PrintAlpha task1= new PrintAlpha();
        PrintNum task2= new PrintNum();
        task1.start(); // executes the run method in PrintAlpha
        task2.start(); // executes the run method in PrintNum
        task1.join();
        task2.join();
        if(task1.isAlive() && task2.isAlive()){
            System.out.println("Thread 1 & 2 alive!");
        }
        else{
            System.out.println("Thread 1 & 2 not alive!");
        }
        System.out.println("Execution Complete..");
    }
}
/*
OUTPUT:
a
1
b
2
c
3
d
4
e
Thread 1 & 2 not alive!
Execution Complete..
*/
