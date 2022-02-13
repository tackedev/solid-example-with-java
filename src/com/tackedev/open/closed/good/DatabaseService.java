package com.tackedev.open.closed.good;

public abstract class DatabaseService {

    protected String dbName;
    protected String dbUsername;
    protected String dbPassword;
    protected String connectionString;

    public DatabaseService(String dbName, String dbUsername, String dbPassword) {
        this.dbName = dbName;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    public void getConnection() {
        System.out.println("Get connection to: " + this.connectionString);
    }
}
