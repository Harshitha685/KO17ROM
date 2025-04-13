package com.xworkz.tasks.notification;

public class NotificationRunner {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.notificationType();
        notification.checkInfo();

        EmailNotification emailNotification = new EmailNotification();
        emailNotification.notificationType();
        emailNotification.checkInfo();

        Notification notification1 = new EmailNotification();

        EmailNotification emailNotification1 = (EmailNotification) notification1;
        System.out.println(emailNotification1);
    }
}
