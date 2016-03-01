package edu.depaul.cdm.se450.pattern.creational.factorymethod;

import edu.depaul.cdm.se450.pattern.creational.account.Account;

public class Main {


    public static void main(String[] args) {
        SavingsAccountFactory saf = new SavingsAccountFactory();
        Account a = saf.createAccount("Dave", 500);

        CheckingAccountFactory caf = new CheckingAccountFactory();
        Account b = caf.createAccount("Dave", 200);

        System.out.println(a);
        System.out.println(b);
    }
}
