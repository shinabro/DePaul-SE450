package edu.depaul.cdm.se450.concurrency;

public class Main {
    public static void main(String[] args) {
        multithreadedCheckingAccount();
    }


    public static void multithreadedCheckingAccount() {
        System.out.println("Checking Account");
        CheckingAccount account = new CheckingAccount(2000, "Dave", 100);
        long[] transactions1 = new long[] {10, -10, 20, -20};
        long[] transactions2 = new long[] {10, -20, 30, -40};
        CheckingAccountThread account1 = new CheckingAccountThread(account, transactions1);
        CheckingAccountThread account2 = new CheckingAccountThread(account, transactions2);
        new Thread(account1).start();
        new Thread(account2).start();

        System.out.println("Final balance: " + account.getBalance());
    }

    public static void multithreadedSavingsAccount() {
        System.out.println("Saving Account");
        SavingsAccount account = new SavingsAccount(2000, "Dave", 100);
        long[] transactions1 = new long[] {10, -10, 20, -20};
        long[] transactions2 = new long[] {10, -20, 30, -40};
        SavingsAccountThread account1 = new SavingsAccountThread(account, transactions1);
        SavingsAccountThread account2 = new SavingsAccountThread(account, transactions2);
        new Thread(account1).start();
        new Thread(account2).start();

        System.out.println(account.getBalance());
    }

    public static void multithreadedGreeting() {
        // Non multithreaded example
        new RunnableGreeting().run();
        new ThreadedGreeting().run();

        // multithreaded example
        //(new Thread(new RunnableGreeting())).start();
        //(new ThreadedGreeting()).start();

    }

    public static void mainAccountDemo() {
        CheckingAccount ca = new CheckingAccount(1002, "Paul", 100);
        SavingsAccount sa = new SavingsAccount(1001, "John", 100);

        ca.deposit(50);
        ca.withdraw(25);
    }

}
