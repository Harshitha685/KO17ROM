package com.xworkz.methodoverriding.post;

public class InstagramPost extends Post {

    @Override
    public void createPost() {
        System.out.println("Creating an Instagram post with caption: " );
    }

    @Override
    public void sharePost() {
        System.out.println("Sharing the Instagram post to feed.");
    }

    @Override
    public void likePost() {
        System.out.println("Liking the Instagram post.");
    }

    @Override
    public void deletePost() {
        System.out.println("Deleting the Instagram post.");
    }

    public void addHashtags() {
        System.out.println("Adding hashtags to the post: ");
    }
}


