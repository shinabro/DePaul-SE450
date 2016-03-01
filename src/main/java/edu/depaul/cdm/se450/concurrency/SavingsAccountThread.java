package edu.depaul.cdm.se450.concurrency;

public class SavingsAccountThread implements Runnable {
    private SavingsAccount account;
    private long[] set;

    public SavingsAccountThread(SavingsAccount account, long[] amt) {
        this.account = account;
        this.set = amt;
    }

    @Override
    public void run() {

        for (long amt : set) {
            if (amt > 0) {
                account.deposit(amt);
            } else {
                account.withdraw(Math.abs(amt));
            }
            System.out.print("Processing: " + amt);
            System.out.println(" balance " + account.getBalance());

            try {
                Thread.sleep(50);
            } catch (InterruptedException ie) {
                System.out.println("deposit or withdraw interrupted! " + ie);
            }
        }

        System.out.println("Processed amount!");
        System.out.println(account.getBalance());
    }
}
