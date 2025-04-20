package com.xworkz.methodoverriding.logger;

public class LoggerRunner {
        public static void main(String[] args) {
            Logger logger = new Logger();
            logger.logInfo();
            logger.logWarning();
            logger.logError();
            logger.logDebug();
            System.out.println();

            Logger file = new FileLogger();
            file.logInfo();
            file.logWarning();
            file.logError();
            file.logDebug();
            System.out.println();

            FileLogger fileLogger = new FileLogger();
            fileLogger.logInfo();
            fileLogger.logWarning();
            fileLogger.logError();
            fileLogger.logDebug();
        }
    }


