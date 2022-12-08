package account;

import java.io.Serializable;

public class Account implements Serializable {
    private String username, password, phoneNumber;
    private boolean Admin = false;//true: admin; false: user

    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String password, String phoneNumber, boolean admin) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        Admin = admin;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public void setAdmin(boolean admin) {
        Admin = admin;
    }

    @Override
    public String toString() {
        return " Account{ " +
                " username = '" + username + '\'' +
                ", password = '" + password + '\'' +
                '}';
    }


}
