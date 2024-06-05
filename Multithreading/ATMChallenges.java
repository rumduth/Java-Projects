class ATM {
    synchronized public void checkBalance(String name) {
        System.out.printf("Customer name is %s\n", name);
    }

    synchronized public void withdraw(String name, double amt) {
        System.out.printf("Customer name is %s, and withdrawn %.2f from the bank\n", name, amt);
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    double amount;

    public Customer(ATM atm, String name, double amount) {
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, 400);
    }

    public void run() {
        useATM();
    }
}

public class ATMChallenges {
    public static void main(String args[]) {
        ATM atm = new ATM();
        Customer c1 = new Customer(atm, "Thong", 2000);
        Customer c2 = new Customer(atm, "Linh", 4000);
        c1.start();
        c2.start();
    }
}
