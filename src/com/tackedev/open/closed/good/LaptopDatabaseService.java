package com.tackedev.open.closed.good;

public class LaptopDatabaseService extends DatabaseService {
    public LaptopDatabaseService(String dbName, String dbUsername, String dbPassword) {
        super(dbName, dbUsername, dbPassword);
    }

    public void save() {
        System.out.println("Save laptop to DB");
    }
}
