package com.xworkz.methodoverriding.report;

public class MonthlyReport extends Report {

    @Override
    public void generateReport() {
        System.out.println("Generating the monthly report.");
    }

    @Override
    public void displayReport() {
        System.out.println("Displaying the monthly report.");
    }

    @Override
    public void saveReport() {
        System.out.println("Saving the monthly report in PDF format.");
    }

    @Override
    public void printReport() {
        System.out.println("Printing the monthly report with graphs.");
    }

    public void sendReport() {
        System.out.println("Sending the report to the stakeholders.");
    }
}


