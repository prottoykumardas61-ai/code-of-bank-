import java.util.*;

class Bank {
    String name;
    int id;
    int balance;

    Bank(String name, int id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sn.nextLine();

        System.out.print("Enter ID: ");
        int id = sn.nextInt();

        System.out.print("Enter balance: ");
        int balance = sn.nextInt();

        Bank account = new Bank(name, id, balance);

        System.out.println("\nAccount Details:");
        account.displayDetails();
    }
}