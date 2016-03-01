package edu.depaul.cdm.se450.pattern.behavioral.cor.logging;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Logging configuration can be passed via -Dlogging.properites but wanted to make it stand alone and so had more code
 */
public class LoggingConfigMain {
    public static void main(String[] args) {
        Logger log1 = Logger.getLogger("edu.depaul.cdm.se450");
        Logger log2 = Logger.getLogger("edu.depaul.cdm.se450.pattern.behavior.cor");

        String propertyFileName = "logging.properties";

        try {
            InputStream in = LoggingConfigMain.class.getClassLoader()
                    .getResourceAsStream(propertyFileName);

            LogManager.getLogManager().readConfiguration(in);
        } catch (IOException ex) {
            System.out.println("WARNING: Could not open configuration file");
            System.out.println("WARNING: Logging not configured (console output only)");
        }
        log1.finest("starting main");
        log2.finest("starting sub");
    }
}
