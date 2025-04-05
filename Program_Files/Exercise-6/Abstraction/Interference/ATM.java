interface ATMabs {
    void withdraw(double amount);
    void deposit(double amount);
}

class BankATM implements ATMabs {

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Total Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        ATMabs atm = new BankATM();
        atm.deposit(20000);
        atm.withdraw(7000);
    }
}
