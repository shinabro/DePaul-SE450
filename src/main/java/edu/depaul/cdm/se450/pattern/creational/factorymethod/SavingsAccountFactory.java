package edu.depaul.cdm.se450.pattern.creational.factorymethod;

import edu.depaul.cdm.se450.pattern.creational.account.Account;
import edu.depaul.cdm.se450.pattern.creational.account.SavingsAccount;

public class SavingsAccountFactory extends AbstractAccountFactory {

    protected Account getAccount() {
        return new SavingsAccount();
    }
}
