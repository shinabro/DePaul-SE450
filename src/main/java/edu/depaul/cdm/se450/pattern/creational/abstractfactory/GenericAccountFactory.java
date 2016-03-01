package edu.depaul.cdm.se450.pattern.creational.abstractfactory;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import edu.depaul.cdm.se450.pattern.creational.account.*;


public class GenericAccountFactory {
    /**
     * Account factory with parameter being passed in as String
     * @param accountType
     * @param name
     * @param initialBalance
     * @return
     */
    public static Account createAccount(String accountType, String name, long initialBalance) {
        if ("SavingsAccount".equalsIgnoreCase(accountType))
            return new SavingsAccount(name, initialBalance);
        else
            return new CheckingAccount(name, initialBalance);

    }

    /**
     * Removes the string parameter to enumeration to reduce the problems with String to pass as differnet type
     * @param accountType
     * @param name
     * @param initialBalance
     * @return
     */
    public static Account createAccountV1(SimpleAccountType accountType, String name, long initialBalance) {
        if (SimpleAccountType.SAVINGS == accountType)
            return new SavingsAccount(name, initialBalance);
        else
            return new CheckingAccount(name, initialBalance);
    }


    /**
     * Allowing enumeration to differentate the types to reduce if statement
     * @param accountType
     * @param name
     * @param initialBalance
     * @return
     */
    public static Account createAccountV2(AccountType accountType, String name, long initialBalance) {
        Account a = accountType.getAccount();
        a.setName(name);
        a.setInitialBalance(initialBalance);

        return a;
    }

    /**
     * Back to basic type but externalizing the depedencies so that hard code of account types in Enumeration is removed
     * @param accountType
     * @param name
     * @param initialBalance
     * @return
     */
    public static Account createAccountV3(SimpleAccountType accountType, String name, long initialBalance) {
        Account account = null;
        Properties properties = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("factory.properties");
        try {
            properties.load(stream);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


        String className = properties.getProperty(accountType.toString());
        try {
            account = (Account) Class.forName(className).newInstance();
            account.setInitialBalance(initialBalance);
            account.setName(name);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return account;
    }



}

