package edu.depaul.cdm.se450.concurrency;

/**
 * Prototype implementation using Copy constructor
 */
public class CheckingAccount extends Account {
    public CheckingAccount(long accountNbr, String name, long balance) {
        super(accountNbr, name, balance);
    }
    /**
     * Synchronizing using method signature
     * @param amt
     * @return
     */
    public synchronized long deposit(long amt) {
        if (amt > 0) {
            setBalance(getBalance() + amt);
        }

        return getBalance();
    }

    /**
     * Synchronizing sample using synchorized block
     * @param amt
     * @return
     */
    public long withdraw(long amt) {
        if (amt > 0) {
            synchronized (this) {
                setBalance(getBalance() - amt);
            }
        }

        return getBalance();
    }

}
