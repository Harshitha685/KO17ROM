package com.xworkz.methodoverriding.report;

public class ReportRunner {

        public static void main(String[] args) {
            Report report = new Report();
            report.generateReport();
            report.displayReport();
            report.saveReport();
            report.printReport();
            System.out.println();

            Report mr = new MonthlyReport();
            mr.generateReport();
            mr.displayReport();
            mr.saveReport();
            mr.printReport();
            System.out.println();

            MonthlyReport monthly = new MonthlyReport();
            monthly.generateReport();
            monthly.displayReport();
            monthly.saveReport();
            monthly.printReport();
            monthly.sendReport();  // Unique method
        }
    }


