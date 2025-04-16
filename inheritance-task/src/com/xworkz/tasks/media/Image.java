package com.xworkz.tasks.media;

public class Image extends Media {
    public void resolution() {
        System.out.println("Resolution: 1920x1080");
    }

    public void imageFormat() {
        System.out.println("Image format: JPG");
    }

    public void applyFilter() {
        System.out.println("Filter applied: Vintage");
    }

    public void cropImage() {
        System.out.println("Image cropped successfully");
    }

    public void imageSize() {
        System.out.println("Image size: 2MB");
    }
}
