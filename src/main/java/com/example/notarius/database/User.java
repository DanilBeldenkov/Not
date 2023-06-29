package com.example.notarius.database;

public class User {
    private String FirstName;
    private String Login;
    private String Password;
    private String Phone;

    public User(String firstName, String login, String password, String phone) {
        FirstName = firstName;
        Login = login;
        Password = password;
        Phone = phone;
    }

    public User() {

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
