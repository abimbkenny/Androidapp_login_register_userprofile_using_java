package com.example.myapp;

public class Userprofile {

    public String userName;
    public String userEmail;
    public String userAge;

    public Userprofile(){


    }

    public Userprofile(String userName, String userEmail, String userAge) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
