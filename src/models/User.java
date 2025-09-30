package models;

public class User {
    private String username, password;
    private int acc_no, pin;
    private double balance;

    public User(String username, String password, int acc_no, int pin, double balance) {
        this.username = username;
        this.password = password;
        this.acc_no = acc_no;
        this.pin = pin;
        this.balance = balance;
    }

    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    public int getPin(){ return pin; }
    public int getAccountNo(){ return acc_no; }
    public double getBalance(){ return balance; }

}