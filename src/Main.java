import services.LoginSystem;
import models.User;
import ui.Home;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String username, password;
        int ch, acc_no, pin;
        double balance;
        while(true){
            System.out.println("\n===== Welcome to the Bank =====");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("\nEnter your account username: ");
                    username = sc.next();
                    System.out.print("Enter your account password: ");
                    password = sc.next();
                    System.out.print("Enter account number: ");
                    acc_no = sc.nextInt();
                    System.out.print("Set your PIN: ");
                    pin = sc.nextInt();
                    System.out.print("Enter initial balance: ");
                    balance = sc.nextDouble();
                    LoginSystem.register(username, password, acc_no, pin, balance);
                    break;

                case 2:
                    System.out.print("\nEnter your username: ");
                    username = sc.next();
                    System.out.print("Enter Password: ");
                    password = sc.next();

                    if(LoginSystem.login(username, password)){
                        User user = LoginSystem.users.get(username);
                        System.out.println("Login Successful!");
                        Home.homePage(user);
                    }
                    else{
                        System.out.println("Invalid Username or Password.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for visiting!");
                    return;
                default:
                    System.out.println("Invalid Input.");
            }
        }
    }
}