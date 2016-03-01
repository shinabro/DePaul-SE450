package edu.depaul.cdm.se450.pattern.creational.factorymethod;

import edu.depaul.cdm.se450.pattern.creational.account.Account;

public abstract class AbstractAccountFactory {
    public Account createAccount(String name, long initBalance) {
        Account a = getAccount();
        a.setName(name);
        a.setInitialBalance(initBalance);

        return a;
    }

    protected abstract Account getAccount();
}
