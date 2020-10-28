package com.example.login_screen_data_saved;

public class UserAccount {
    private String userName;
    private String password;
    private String number;
    private boolean checkBox;
    private boolean rememberMe;

    public UserAccount(String userName, String password, String number, boolean checkBox, boolean rememberMe) {
        this.userName = userName;
        this.password = password;
        this.number = number;
        this.checkBox = checkBox;
        this.rememberMe = rememberMe;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isCheckBox() {
        return checkBox;
    }

    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
    public String toString(){
        return "User Name: "+this.userName+" \n" +
                "Password:  "+this.password+" \n" +
                "Phone Number: "+this.number+" \n" +
                "Terms Agreed to: "+this.checkBox+" \n" +
                "Remember User: "+this.rememberMe;
    }
}
