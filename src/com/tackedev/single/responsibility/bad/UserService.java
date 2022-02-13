package com.tackedev.single.responsibility.bad;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

public class UserService {

    public void registerUser(User user) {
        // save user to database
        final String dbUsername = "tackedev";
        final String dbPassword = "tackeditu";
        final String connectionString = "jdbc:mysql://localhost:3306/Solid" +
                                        "?user=" + dbUsername +
                                        "&password=" + dbPassword;
        System.out.println("Get connection to: " + connectionString);
        System.out.println("Save " + user.toString() + " to MySQL Database");

        // send mail to user for verification
        final String fromEmail = "tackedev@dsc.com";
        final String password = "tackeditu";

        final String toEmail = user.getEmail();
        final String subject = "Confirm user registration";
        final Date date = new Date();
        final String body = "Hello world!";

        System.out.println("Send email: \n" +
                            "From: " + fromEmail + "\n" +
                            "To: " + toEmail + "\n" +
                            "Subject: " + subject + "\n" +
                            "Body: " + body);
    }
}
