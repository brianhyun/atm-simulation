package ATM;

import java.util.Scanner;
import java.util.UUID;

public class Account {
    // Attributes
    private String customerId;
    private int pinNum;

    // Methods
    public String getCustomerId() {
        return customerId;
    }

    public int getPinNum() {
        return pinNum;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setPinNum(int pinNum) {
        this.pinNum = pinNum;
    }

    public void createNewAccount() {
        System.out.println("\n>> Create a New Account");

        // Set UUID for Customer ID
        String uuid = UUID.randomUUID().toString();
        setCustomerId(uuid);
        System.out.println("You're unique customer identifier is: " + uuid);
        System.out.println("Keep this in a safe place! You'll need it every time you login!\n");

        // Prompt Customer for Pin Password
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            System.out.print("Create a six-digit pin for your new account: ");

            int firstPin = scanner.nextInt();

            if (String.valueOf(firstPin).length() == 6) {
                boolean pinConfirm = false;

                while (!pinConfirm) {
                    System.out.print("Confirm your pin: ");

                    int secondPin = scanner.nextInt();

                    if (secondPin == firstPin) {
                        setPinNum(secondPin);
                        pinConfirm = true;
                        valid = true;
                        System.out.println(">> Pin Match Successful");
                    } else {
                        System.out.println("Pins don't match! Please try again!");
                        break;
                    }
                }
            } else {
                System.out.println("Invalid entry! Make sure your input is six-digit number.");
            }
        }

        System.out.println(">> Account Successfully Created");
    }
}
