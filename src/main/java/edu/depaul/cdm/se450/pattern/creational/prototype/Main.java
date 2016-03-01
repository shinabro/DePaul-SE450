package edu.depaul.cdm.se450.pattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(1002, "Paul", 100);
        SavingsAccount sa = new SavingsAccount( 1001, "John", 100);

        CheckingAccount ca2 = new CheckingAccount(ca);
        if (ca == ca2) {
            System.out.println("==");
        }
        if (ca.equals(ca2)) {
            System.out.println("equals");
        }

        System.out.println("Clone");
        try {
            SavingsAccount sa2 = (SavingsAccount) sa.clone();
            if (sa == sa2) {
                System.out.println("==");
            }
            if (sa.equals(sa2)) {
                System.out.println("equals");
                System.out.println(sa);
                System.out.println(sa2);
            }
            sa.deposit(50);
            System.out.println(sa.getBalance());
            System.out.println(sa2.getBalance());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

//        SavingsAccount sa2 = sa.clone();

    }
}
