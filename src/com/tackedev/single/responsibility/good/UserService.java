package com.tackedev.single.responsibility.good;

public class UserService {

    public void registerUser(User user) {
        // save user to database
        DatabaseService databaseService = new DatabaseService("mysql", "tackedev", "tackeditu");
        databaseService.saveUser(user);

        // send mail to user for verification
        EmailService emailService = new EmailService("tackedev@dsc.com", "tackeditu");
        emailService.sendEmail(user.getEmail(), "Confirm user registration", "Hello world!");
    }
}
