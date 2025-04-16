package com.xworkz.tasks.notification;

public class EmailNotification extends Notification {
    public void senderEmail() {
        System.out.println("Sender: support@example.com");
    }

    public void subject() {
        System.out.println("Subject: Password Reset");
    }

    public void hasAttachment() {
        System.out.println("Attachment: Yes");
    }

    public void emailClient() {
        System.out.println("Client: Gmail");
    }

    public void folder() {
        System.out.println("Folder: Inbox");
    }
}
