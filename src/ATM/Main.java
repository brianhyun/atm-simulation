package ATM;

import ATM.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to BDH Bank ATM!");
        System.out.println("What would you like to do?");
        System.out.println("1: Signup for a New Account");
        System.out.println("2: Login to an Existing Account");
        System.out.print("Enter option number: ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == 1) {
            Account newAccount = new Account();
            newAccount.createNewAccount();
        } else if (option == 2) {
            // login flow
        }
    }
}

