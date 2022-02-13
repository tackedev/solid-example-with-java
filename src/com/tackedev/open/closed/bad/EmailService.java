package com.tackedev.open.closed.bad;

import java.util.Date;

public class EmailService {

    private String fromEmail;
    private String fromPassword;

    public EmailService(String fromEmail, String fromPassword) {
        this.fromEmail = fromEmail;
        this.fromPassword = fromPassword;
    }

    public void sendEmail(String toEmail, String subject, String body) {
        Date date = new Date();
        System.out.println("Send email: \n" +
                "From: " + this.fromEmail + "\n" +
                "To: " + toEmail + "\n" +
                "Subject: " + subject + "\n" +
                "Body: " + body);
    }
}
