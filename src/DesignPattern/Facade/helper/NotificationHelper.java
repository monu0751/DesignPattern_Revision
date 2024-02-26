package DesignPattern.Facade.helper;

import DesignPattern.Facade.NotificationService;

public class NotificationHelper {
    NotificationService notificationService = new NotificationService();
    public void sendNotification(){
        notificationService.sendEmail();
        notificationService.sendSms();
    }
}
