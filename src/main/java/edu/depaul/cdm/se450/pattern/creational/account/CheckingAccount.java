package edu.depaul.cdm.se450.pattern.creational.account;

import edu.depaul.cdm.se450.pattern.creational.account.Account;

public class CheckingAccount extends Account {

    public CheckingAccount() {
        super("",0);
    }

    public CheckingAccount(String name, long initBalance) {
        super(name, initBalance);
    }

    public String toString() {
        return "CheckingAccount " + super.toString();
    }
}
