package com.jscoder.Streams.modesl;

public class Ususario {

    private String username;
    private String password;
    private String email;
    private String cellphoneNumber;

    public Ususario(String username, String password, String email, String cellphoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.cellphoneNumber = cellphoneNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    @Override
    public String toString() {
        return "Ususario{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", cellphoneNumber='" + cellphoneNumber + '\'' +
                '}';
    }
}
