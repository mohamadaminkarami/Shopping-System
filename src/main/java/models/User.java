package main.java.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class User {

    private final static ArrayList<User> allUsers = new ArrayList<>();

    private static int id = 0;

    private final int userId;
    private final String createAt;
    private String username;
    private String password;

    public User(String username, String password) {
        this.userId = ++id;
        this.username = username;
        this.password = password;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd | HH:mm:ss");
        this.createAt = now.format(formatter);

        User.allUsers.add(this);

    }

    public static User getUserByUsername(String username) {
        for (User user : User.allUsers) {
            if (user.username.equals(username)) {
                return user;
            }

        }
        return null;
    }

    public int getUserId() {
        return this.userId;
    }


    public String getCreate_at() {
        return this.createAt;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
