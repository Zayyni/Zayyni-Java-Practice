package com.zayyni.module1introduction.impl;

import com.zayyni.module1introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("smsNotify")
public class SMSNotificationService implements NotificationService {

    @Override
    public void send() {
        System.out.println("SMS Notification Service");
    }
}
