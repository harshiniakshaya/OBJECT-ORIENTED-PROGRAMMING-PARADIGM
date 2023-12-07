/*
--Test using Online GDB--
Problem Statement:
Create a Java class called "BankAccount" with a private attribute for
the account balance. Implement public methods for deposit and
withdraw operations, ensuring that the withdraw method checks for
sufficient balance before performing the transaction.
(BANKING SYSTEM FOR A SINGLE USER)
*/
import java.util.*;
class BankAccount{
    Scanner s = new Scanner(System.in);
    String name;
    int accno;
    private double balance;
    public BankAccount(String n, int a){
        this.name=n;
        this.accno=a;
    }
    public void Deposit(double amt){
        balance+=amt;
        System.out.println("Deposit Successful");
    }
    public void Withdraw(double amt){
        if(amt>balance||amt<0){
            System.out.println("Insufficient Balance or Invalid amount");
            System.out.println("Press 1 to check balance, Else Press 0");
            int ch=s.nextInt();
            if(ch==1){
                this.BalanceCheck();
            }
        }
        else{
            balance-=amt;
            System.out.println("Withdraw Successful");
            System.out.println("Press 1 to check balance, Else Press 0");
            int ch=s.nextInt();
            if(ch==1){
                this.BalanceCheck();
            }
        }
    }
    public void BalanceCheck(){
        System.out.println("Available Balance: "+this.balance);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        BankAccount a1= new BankAccount("harshini",123);
        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
        int ch;
        double amt;
        while(true){
            System.out.print("Enter your choice:");
            ch=s.nextInt();
            if(ch==1){
                System.out.print("Enter deposit amount:");
                amt=s.nextDouble();
                a1.Deposit(amt);
            }
            else if(ch==2){
                System.out.print("Enter withdrawal amount:");
                amt=s.nextDouble();
                a1.Withdraw(amt);
            }
            else if(ch==3){
                a1.BalanceCheck();
            }
            else if(ch==4){
                System.out.println("Thank You!");
                break;
            }
            else{
                System.out.println("Invalid Choice!");
            }
            
        }
    }
}
/*
SAMPLE INPUT AND OUTPUT:
1.Deposit
2.Withdraw
3.Check Balance
4.Exit
Enter your choice:1
Enter deposit amount:100
Deposit Successful
Enter your choice:3
Available Balance: 100.0
Enter your choice:2
Enter withdrawal amount:1000
Insufficient Balance or Invalid amount
Press 1 to check balance, Else Press 0
1
Available Balance: 100.0
Enter your choice:2
Enter withdrawal amount:-50
Insufficient Balance or Invalid amount
Press 1 to check balance, Else Press 0
0
Enter your choice:2
Enter withdrawal amount:50
Withdraw Successful
Press 1 to check balance, Else Press 0
0
Enter your choice:3
Available Balance: 50.0
Enter your choice:4
Thank You!
*/
