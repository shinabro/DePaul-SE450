package edu.depaul.cdm.se450.pattern.creational.factorymethod;

import edu.depaul.cdm.se450.pattern.creational.account.Account;
import edu.depaul.cdm.se450.pattern.creational.account.CheckingAccount;

public class CheckingAccountFactory extends AbstractAccountFactory {

    protected Account getAccount() {
        return new CheckingAccount();
    }
}
