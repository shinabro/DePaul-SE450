package edu.depaul.cdm.se450.concurrency;

public class RunnableGreeting implements Runnable {
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Child : " + i);

            try {
                Thread.sleep(50);
            } catch (InterruptedException ie) {
                System.out.println("Runnable Child thread interrupted! " + ie);
            }
        }

        System.out.println("Runnable Child finished!");
    }

}
