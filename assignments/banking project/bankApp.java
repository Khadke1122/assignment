import java.util.*;

public class bankApp{
    public static void main(String[] args){
            bankAccount obj = new bankAccount("kunal", "AB0021");
            obj.showMenu();
    }
}
class bankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    bankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }
    void deposite(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposite: "+previousTransaction);
       }
       else if(previousTransaction < 0){
         System.out.println("withdrawn: "+Math.abs(previousTransaction));
       }
       else{
        System.out.println("No Transaction occured");
       }
    }
void showMenu(){
    char option = '\0';
    Scanner scanner = new Scanner(System.in);

    System.out.println("welcome "+customerName);
    System.out.println("Your ID is "+customerId);
    System.out.println("\n");
    System.out.println("A. Check Balance");
    System.out.println("B. Deposite");
    System.out.println("C. Withdraw");
    System.out.println("D. Previous transaction");
    System.out.println("E. Exit");

    do{
        System.out.println("************************************************");
        System.out.println("Enter an option");
        System.out.println("************************************************");
        option = scanner.next().charAt(0);
       // System.out.println("\n");
   
    switch(option){
        case 'A':
            System.out.println("-------------------------------------");
            System.out.println("balance = "+balance);
            System.out.println("-------------------------------------");
          //  System.out.println("\n");
            break;
            
        case 'B':
            System.out.println("-------------------------------------");
            System.out.println("Enter an amount that should deposite");
            System.out.println("-------------------------------------");
            int amount = scanner.nextInt();
            deposite(amount);
        //    System.out.println("\n");
            break;

        case 'C':
            System.out.println("-------------------------------------");
            System.out.println("Enter amount that should withdraw");
            System.out.println("-------------------------------------");
            int amount2 = scanner.nextInt();
            withdraw(amount2);
           // System.out.println("\n");
            break;

        case 'D':
            System.out.println("-------------------------------------");
            getPreviousTransaction();
            System.out.println("-------------------------------------");
         //   System.out.println("\n");
            break;
        
        case 'E':
            System.out.println("***********************************************");
            break;

        default:
            System.out.println("Invalid !!!. Please enter again");
            break;
        }
    }
    while(option != 'E');
    System.out.println("Thank you for using services");
}
}