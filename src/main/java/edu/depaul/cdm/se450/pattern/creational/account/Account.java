package edu.depaul.cdm.se450.pattern.creational.account;

public abstract class Account {
    private String name;
    private long balance;

    protected Account(String name, long initBalance) {
        this.setName(name);
        this.setBalance(initBalance);
    }

    public double getBalance() {
        return balance;
    }

    public void setInitialBalance(long initialBalance) {
        this.setBalance(initialBalance);
    }


    private void setBalance(long bal) {
        this.balance = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
