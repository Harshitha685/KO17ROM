package com.xworkz.tasks.paper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.printPaper();
        paper.submitPaper();

        NewsPaper newsPaper = new NewsPaper();
        newsPaper.printPaper();
        newsPaper.submitPaper();
    }
}
