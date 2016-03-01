package edu.depaul.cdm.se450.concurrency;

/**
 * Example of encapsulatioon, what changes in subclass, if we were to remove name and replace with Person?
 */
public abstract class Account {
    private long accountNbr;
    private Person accountHolder;
    private long balance;

    public Account(long accountNbr, String name, long balance) {
        this.accountNbr = accountNbr;
        this.accountHolder = new Person(name);
        this.balance = balance;
    }

    public long getAccountNbr() {
        return accountNbr;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNbr=" + accountNbr +
                ", accountHolder=" + accountHolder +
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
        return accountHolder != null ? accountHolder.equals(account.accountHolder) : account.accountHolder == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (accountNbr ^ (accountNbr >>> 32));
        result = 31 * result + (accountHolder != null ? accountHolder.hashCode() : 0);
        result = 31 * result + (int) (balance ^ (balance >>> 32));
        return result;
    }

    protected void setBalance(long bal) {
        this.balance = bal;
    }
}
