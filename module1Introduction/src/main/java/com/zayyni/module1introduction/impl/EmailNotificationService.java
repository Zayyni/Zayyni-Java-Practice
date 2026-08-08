package com.zayyni.module1introduction.impl;

import com.zayyni.module1introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailNotify")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send() {
        System.out.println("Email Notification Service");
    }
}
