package edu.depaul.cdm.se450.pattern.creational.abstractfactory;

import edu.depaul.cdm.se450.pattern.creational.account.Account;
public class Main {


    public static void main(String[] args) {
        Account a = GenericAccountFactory.createAccount("Checking", "Dave", 100);

        Account b = GenericAccountFactory.createAccountV1(SimpleAccountType.CHECKING, "Dave", 200);
        Account c = GenericAccountFactory.createAccountV2(AccountType.CHECKING, "Dave", 300);

        Account d = GenericAccountFactory.createAccountV3(SimpleAccountType.CHECKING, "Dave", 400);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
