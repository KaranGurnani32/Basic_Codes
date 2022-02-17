package practice_basic_code;

public class Account {
    //working of banking system
    int acc_No;
    String name;
    float amount;

    //Method to initialize object
    void insert(int a, String n, float amt) {
        acc_No = a;
        name = n;
        amount = amt;
    }

    //deposit method
    void deposit(int amt) {
        amount = amount + amt;
        System.out.println(amt + " Deposited");
    }

    //withdraw method
    void withdraw(int amt) {
        if (amt > amount) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
        }
    }

    //method to check balance
    void checkBalance(){
        System.out.println("Balance is :" + amount);
    }

    //method to display values of object
    void display(){
        System.out.println(acc_No + " " + name + " " + amount);
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(1241, "Karan", 7000);
        a1.deposit(5000);
        a1.display();
        a1.checkBalance();

        a1.withdraw(2000);
        a1.display();
        a1.checkBalance();
    }
}
