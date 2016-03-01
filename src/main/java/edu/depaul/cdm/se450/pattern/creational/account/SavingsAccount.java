package edu.depaul.cdm.se450.pattern.creational.account;

import edu.depaul.cdm.se450.pattern.creational.account.Account;

public class SavingsAccount extends Account {
    public SavingsAccount() {
        super("",0);
    }

    public SavingsAccount(String name, long initBalance) {
        super(name, initBalance);
    }

    public String toString() {
        return "SavingsAccount " + super.toString();
    }

}
