package com.tackedev.open.closed.bad;

public class DatabaseService {

    private String dbName;
    private String dbUsername;
    private String dbPassword;
    private final String connectionString;

    public DatabaseService(String dbName, String dbUsername, String dbPassword) {
        this.dbName = dbName;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
        connectionString = "jdbc:" + dbName + "://localhost:3306/Solid" +
                "?user=" + dbUsername +
                "&password=" + dbPassword;
    }

    public void saveUser(User user) {
        System.out.println("Get connection to: " + this.connectionString);
        System.out.println("Save " + user.toString() + " to MySQL Database");
    }
}
