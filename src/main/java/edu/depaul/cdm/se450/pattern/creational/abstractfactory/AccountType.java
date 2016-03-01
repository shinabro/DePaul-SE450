package edu.depaul.cdm.se450.pattern.creational.abstractfactory;

import edu.depaul.cdm.se450.pattern.creational.account.*;


/**
 * More complex enumeration showing account types
 */
public enum AccountType {
    SAVINGS(new SavingsAccount()),
    CHECKING(new CheckingAccount())

    ;

    private Account account;
    private AccountType(Account a) {
        account = a;
    }

    public Account getAccount() {
        return account;
    }

    /**
     * Basic enumeration of Account Types
     */
    public static enum SimpleAccountType {
        SAVINGS,
        CHECKING
        ;
    }
}

