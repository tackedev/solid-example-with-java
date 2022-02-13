package com.tackedev.open.closed.good;

public class UserOracleDatabaseService extends DatabaseService {

    public UserOracleDatabaseService(String dbUsername, String dbPassword) {
        super("oracle", dbUsername, dbPassword);
        this.connectionString = "jdbc:oracle:thin://localhost:1521/solid" +
                                "?username=" + this.dbUsername +
                                "&password=" + this.dbPassword;
    }

    public void save(User user) {
        this.getConnection();
        System.out.println("Save " + user.toString() + " to Oracle Database");
    }

}
