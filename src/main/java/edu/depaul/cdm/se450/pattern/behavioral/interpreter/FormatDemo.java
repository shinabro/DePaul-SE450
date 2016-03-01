package edu.depaul.cdm.se450.pattern.behavioral.interpreter;


import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class FormatDemo {
    public static void main(String[] args) {
        System.out.println("-- 1.  Display number--");
        System.out.println("-- US --");
        displayNumber(Locale.US);
        System.out.println("-- France --");
        displayNumber(Locale.FRANCE);

        System.out.println("-- 2.  Display number--");
        System.out.println("-- US --");
        displayCurrency(Locale.US);
        System.out.println("-- France --");
        displayCurrency(Locale.FRANCE);
        System.out.println("-- 3.  Display percent--");
        System.out.println("-- US --");
        displayPercent(Locale.US);
        System.out.println("-- France --");
        displayPercent(Locale.FRANCE);
    }

    public static void displayNumber(Locale currentLocale) {
        Integer quantity = new Integer(123456);
        Double amount = new Double(345987.246);
        NumberFormat numberFormatter;
        String quantityOut;
        String amountOut;

        numberFormatter = NumberFormat.getNumberInstance(currentLocale);
        quantityOut = numberFormatter.format(quantity);
        amountOut = numberFormatter.format(amount);
        System.out.println(quantityOut + "   " + currentLocale.toString());
        System.out.println(amountOut + "   " + currentLocale.toString());

    }

    static public void displayCurrency( Locale currentLocale) {

        Double currencyAmount = new Double(9876543.21);
        Currency currentCurrency = Currency.getInstance(currentLocale);
        NumberFormat currencyFormatter =
                NumberFormat.getCurrencyInstance(currentLocale);

        System.out.println(
                currentLocale.getDisplayName() + ", " +
                        currentCurrency.getDisplayName() + ": " +
                        currencyFormatter.format(currencyAmount));
    }

    static public void displayPercent(Locale currentLocale) {

        Double percent = new Double(0.75);
        NumberFormat percentFormatter;
        String percentOut;

        percentFormatter = NumberFormat.getPercentInstance(currentLocale);
        percentOut = percentFormatter.format(percent);
        System.out.println(percentOut + "   " + currentLocale.toString());
    }


}
