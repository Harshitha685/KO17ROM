package com.xworkz.tasks.media;

public class MediaRunner {
    public static void main(String[] args) {
        Media media = new Media();
        media.mediaName();
        media.displayInfo();

        Image image = new Image();
        image.mediaName();
        image.displayInfo();
    }
}
