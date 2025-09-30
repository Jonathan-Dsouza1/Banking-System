package services;

import models.User;
import java.util.HashMap;

public class LoginSystem {
    public static HashMap<String, User> users = new HashMap<>();

    // Create new user
    public static void register(String username, String password, int acc_no, int pin, double deposit){
        try {
            if(username == null || password == null){
                throw new IllegalArgumentException("Username or password cannot be null");
            }
            if(users.containsKey(username)){
                throw new Exception("User already exists.");
            }
            users.put(username, new User(username, password, acc_no, pin, deposit));
            System.out.print("User " + username + "'s account created Successfully!\n");
        }
        catch (IllegalArgumentException e){
            System.out.println("Registration failed: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Registration failed: " + e.getMessage());
        }
    }

    // Authenticate user
    public static boolean login(String username, String password){
        User user = users.get(username);
        if(users.containsKey(username)){
            return user.getPassword().equals(password);
        }
        return false;
    }
}
