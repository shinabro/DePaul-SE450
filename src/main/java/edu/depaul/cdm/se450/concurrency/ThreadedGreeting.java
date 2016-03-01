package edu.depaul.cdm.se450.concurrency;

public class ThreadedGreeting extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Threaded Child : " + i);

            try {
                Thread.sleep(50);
            } catch (InterruptedException ie) {
                System.out.println("Threaded Child ! " + ie);
            }
        }

        System.out.println("Threaded Greeting finished!");
    }
}
