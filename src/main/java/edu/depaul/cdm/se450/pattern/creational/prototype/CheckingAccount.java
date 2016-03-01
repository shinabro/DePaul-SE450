package edu.depaul.cdm.se450.pattern.creational.prototype;

/**
 * Prototype implementation using Copy constructor
 */
public class CheckingAccount extends Account {
    public CheckingAccount(long accountNbr, String name, long balance) {
        super(accountNbr, name, balance);
    }

    /**
     * Example of copy constructor
     * @param ca
     */
    public CheckingAccount(CheckingAccount ca) {
        super(ca.getAccountNbr(), ca.getName(), ca.getBalance());
    }
}
