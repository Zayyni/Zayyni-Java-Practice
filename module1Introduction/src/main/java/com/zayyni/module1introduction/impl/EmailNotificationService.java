package com.zayyni.module1introduction.impl;

import com.zayyni.module1introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("emailNotify")
@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send() {
        System.out.println("Email Notification Service");
    }
}
