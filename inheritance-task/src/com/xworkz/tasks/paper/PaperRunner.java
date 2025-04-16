package com.xworkz.tasks.paper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.paperType();
        paper.paperSize();
        paper.color();
        paper.gsm();
        paper.isRecycled();

        System.out.println("--------------------------");

        Paper paper2 = new NewsPaper();
        paper2.paperType();
        paper2.paperSize();
        paper2.color();
        paper2.gsm();
        paper2.isRecycled();

        System.out.println("--------------------------");

        NewsPaper news = new NewsPaper();
        news.publicationName();
        news.dailyEdition();
        news.price();
        news.language();
        news.totalPages();

        System.out.println("--------------------------");

        Paper paper3 = new NewsPaper();
        NewsPaper news2 = (NewsPaper) paper3;
        System.out.println(news2);
    }
}
