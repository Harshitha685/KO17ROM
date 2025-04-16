package com.xworkz.tasks.media;

public class MediaRunner {
    public static void main(String[] args) {

        Media media = new Media();
        media.mediaType();
        media.mediaSize();
        media.format();
        media.source();
        media.isDownloaded();

        System.out.println();


        Media media2 = new Image();
        media2.mediaType();
        media2.mediaSize();
        media2.format();
        media2.source();
        media2.isDownloaded();


        Image image = new Image();
        image.resolution();
        image.imageFormat();
        image.applyFilter();
        image.cropImage();
        image.imageSize();

        System.out.println();


        Media media3 = new Image();
        Image image1 = (Image) media3;
        System.out.println(image1);
    }
}
