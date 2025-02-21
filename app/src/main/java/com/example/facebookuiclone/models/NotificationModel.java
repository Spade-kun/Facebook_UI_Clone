package com.example.facebookuiclone.models;

public class NotificationModel {
    private String notificationText;
    private String notificationTime;
    private int profileImage;

    public NotificationModel(String notificationText, String notificationTime, int profileImage) {
        this.notificationText = notificationText;
        this.notificationTime = notificationTime;
        this.profileImage = profileImage;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
