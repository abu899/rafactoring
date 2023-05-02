package com.refactoring.study.section21.after;

public class AlertNotificationService implements NotificationService{
    private AlertService alertService;

    @Override
    public void sendNotification(Notification notification) {
        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setMessage(notification.getTitle());
        alertMessage.setFor(notification.getReceiver());
        alertService.add(alertMessage);
    }
}
