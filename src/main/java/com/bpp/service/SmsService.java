//package com.bpp.service;
//
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SmsService {
//
//    @Value("${twilio.account.sid}")
//    private String accountSid;
//
//    @Value("${twilio.auth.token}")
//    private String authToken;
//
//    @Value("${twilio.phone.number}")
//    private String fromPhoneNumber;
//
//    // Constructor to initialize Twilio with the credentials
//    public SmsService() {
//        // Use the instance variables injected by Spring
//        Twilio.init(accountSid, authToken);
//    }
//
//    // Method to send SMS
//    public void sendSms(String to, String message) {
//        Message.creator(
//                new PhoneNumber(to),
//                new PhoneNumber(fromPhoneNumber),
//                message
//        ).create();
//    }
//}
