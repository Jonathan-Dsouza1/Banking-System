import java.util.HashMap;
import java.util.Scanner;

class User {
    private String username, password;
    private int acc_no, pin;
    private double deposit;

    public User(String username, String password, int acc_no, int pin, double deposit) {
        this.username = username;
        this.password = password;
        this.acc_no = acc_no;
        this.pin = pin;
        this.deposit = deposit;
    }

    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    public int getPin(){ return pin; }
    public int getAccountNo(){ return acc_no; }
    public double getDeposit(){ return deposit; }

}

class LoginSystem {
    private static HashMap<String, User> users = new HashMap<>();

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

//class Home {
//
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String username, password;
        int ch, acc_no, pin;
        double deposit;
        int acc_no_check = 0, pin_check = 0;
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
                    System.out.print("Enter initial deposit: ");
                    deposit = sc.nextDouble();
                    LoginSystem.register(username, password, acc_no, pin, deposit);
                    break;

                case 2:
                    System.out.print("\nEnter your username: ");
                    username = sc.next();
                    System.out.print("Enter Password: ");
                    password = sc.next();

                    if(LoginSystem.login(username, password)){
                        System.out.println("Login Successful!");
                    }
                    else{
                        System.out.println("Invalid Username or Password.");
                    }
                    break;

                case 3:
                    return;
            }
        }
    }
}