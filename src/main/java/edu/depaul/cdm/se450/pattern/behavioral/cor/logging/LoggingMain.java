package edu.depaul.cdm.se450.pattern.behavioral.cor.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingMain {
    private static final Logger logger = Logger.getLogger(LoggingMain.class.getName());

    public static void main(String[] args) {
        logger.log(Level.FINEST, "This is a test");
    }
}
