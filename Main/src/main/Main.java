/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    
        Login login = new Login();

        // LOGIN SECTION
        System.out.println("=== LOGIN ===");

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        boolean loggedIn = login.loginUser(username, password);

        if (loggedIn) {

            System.out.println("Welcome to QuickChat.");

            System.out.print("How many messages would you like to send? ");
            int total = input.nextInt();
            input.nextLine();

            for (int i = 1; i <= total; i++) {

                System.out.println("\n1) Send Messages");
                System.out.println("2) Show recently sent messages");
                System.out.println("3) Quit");

                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Enter recipient number: ");
                        String recipient = input.nextLine();

                        System.out.print("Enter message: ");
                        String text = input.nextLine();

                        Message msg = new Message(i, recipient, text);

                        System.out.println(msg.checkRecipientCell());
                        System.out.println(msg.validateMessageLength());

                        System.out.println("\nChoose:");
                        System.out.println("1) Send");
                        System.out.println("2) Disregard");
                        System.out.println("3) Store");

                        int option = input.nextInt();
                        input.nextLine();

                        System.out.println(msg.sentMessage(option));

                        System.out.println(msg.printMessages());

                        break;

                    case 2:
                        System.out.println("Coming Soon.");
                        break;

                    case 3:
                        System.out.println("Goodbye.");
                        System.exit(0);

                    default:
                        System.out.println("Invalid option.");
                }
            }

            System.out.println("\nTotal messages sent: "
                    + Message.returnTotalMessages());

        } else {

            System.out.println("Login failed.");
        }
    }
    
}
