package edu.depaul.cdm.se450.concurrency;

/**
 * Implementation of Prototype using clone interface
 * Try:  commenting out the implements Cloneable....
 */
public class SavingsAccount extends Account  {
    public SavingsAccount(long accountNbr, String name, long balance) {
        super(accountNbr, name, balance);
    }
    /**
     * Synchronizing using method signature
     * @param amt
     * @return
     */
    public long deposit(long amt) {
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
                setBalance(getBalance() - amt);
        }

        return getBalance();
    }

}
