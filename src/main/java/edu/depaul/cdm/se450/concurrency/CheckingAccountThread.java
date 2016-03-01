package edu.depaul.cdm.se450.concurrency;

/**
 * Created by ubuntu on 2/7/16.
 */
public class CheckingAccountThread implements Runnable{
    private CheckingAccount account;
    private long[] set;

    public CheckingAccountThread(CheckingAccount account, long[] amt) {
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

        System.out.print("Processed amount!");
        System.out.println(account.getBalance());
    }
}
