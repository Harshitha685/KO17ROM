package com.xworkz.tasks.notification;

public class NotificationRunner {
    public static void main(String[] args) {
        Notification notifi = new Notification();
        notifi.notifiType();
        notifi.message();
        notifi.priority();
        notifi.timeReceived();
        notifi.isRead();

        System.out.println("--------------------------");

        Notification notifi2 = new EmailNotification();
        notifi2.notifiType();
        notifi2.message();
        notifi2.priority();
        notifi2.timeReceived();
        notifi2.isRead();

        System.out.println("--------------------------");

        EmailNotification email = new EmailNotification();
        email.senderEmail();
        email.subject();
        email.hasAttachment();
        email.emailClient();
        email.folder();

        System.out.println("--------------------------");

        Notification notifi3 = new EmailNotification();
        EmailNotification email2 = (EmailNotification) notifi3;
        System.out.println(email2);
    }
}
