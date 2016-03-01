package edu.depaul.cdm.se450.pattern.creational.prototype;

/**
 * Example of encapsulatioon, what changes in subclass, if we were to remove name and replace with Person?
 */
public abstract class Account {
    private long accountNbr;
    private String name;
//    private Person accountHolder;
    private long balance;

    public Account(long accountNbr, String name, long balance) {
        this.accountNbr = accountNbr;
        this.name = name;
//        this.accountHolder = new Person(name);
        this.balance = balance;
    }

    public long getAccountNbr() {
        return accountNbr;
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNbr=" + accountNbr +
                ", name='" + name + '\'' +
//                ", accountHolder=" + accountHolder +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (accountNbr != account.accountNbr) return false;
        if (balance != account.balance) return false;
        return name != null ? name.equals(account.name) : account.name == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (accountNbr ^ (accountNbr >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (balance ^ (balance >>> 32));
        return result;
    }

    public long deposit(long amt) {
        if (amt > 0) {
            balance += amt;
        }

        return balance;
    }
}
