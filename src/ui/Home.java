package ui;

import models.User;
import java.util.Scanner;

public class Home {
    public static void homePage(User user){
        Scanner sc = new Scanner(System.in);
        String username = user.getUsername();
        int acc_no = user.getAccountNo();
        while(true){
            System.out.println("\n====================================");
            System.out.println("      WELCOME TO CONSOLE BANK");
            System.out.println("====================================");
            System.out.println("Account Holder : " + username);
            System.out.println("Account No     : " + acc_no);
            System.out.println("------------------------------------");
            System.out.println("Choose from the following: ");
            System.out.println("1. Account Information");
            System.out.println("2. Balance Inquiry");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Transaction History");
            System.out.println("7. Logout");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
            }
            if(ch == 1){
                return;
            }
        }
    }
}