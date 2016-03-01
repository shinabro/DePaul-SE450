package edu.depaul.cdm.se450.pattern.creational.prototype;

/**
 * Implementation of Prototype using clone interface
 * Try:  commenting out the implements Cloneable....
 */
public class SavingsAccount extends Account implements Cloneable {
    public SavingsAccount(long accountNbr, String name, long balance) {
        super(accountNbr, name, balance);
    }

    public SavingsAccount clone() throws CloneNotSupportedException {
        return (SavingsAccount) super.clone();
    }
}
