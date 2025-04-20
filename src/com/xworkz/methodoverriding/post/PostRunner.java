package com.xworkz.methodoverriding.post;

import javafx.geometry.Pos;

public class PostRunner {
        public static void main(String[] args) {
            Post post = new Post();
            post.createPost();
            post.sharePost();
            post.likePost();
            post.deletePost();
            System.out.println();

            Post ip = new InstagramPost();
            ip.createPost();
            ip.sharePost();
            ip.likePost();
            ip.deletePost();
            System.out.println();

            InstagramPost instagramPost = new InstagramPost();
            instagramPost.createPost();
            instagramPost.sharePost();
            instagramPost.likePost();
            instagramPost.deletePost();
            instagramPost.addHashtags();
        }
    }


