package com.xworkz.methodoverriding.logger;

public class FileLogger extends Logger {

    @Override
    public void logInfo() {
        System.out.println("Writing info message to file.");
    }

    @Override
    public void logWarning() {
        System.out.println("Writing warning message to file.");
    }

    @Override
    public void logError() {
        System.out.println("Writing error message to error.log file.");
    }

    @Override
    public void logDebug() {
        System.out.println("Writing debug message to debug.log file.");
    }
}


