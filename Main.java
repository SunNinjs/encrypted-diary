import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        String storedUsername = "";
        String storedPassword = "";

        System.out.println ("Welcome to your personal diary");
        System.out.println ("1. Create acoount");
        System.out.println ("2. log in");
        System.out.println ("Choose an option");
        int choice = input.nextInt ();
        input.nextLine();

        if (choice == 1) {
            //create new account
            System.out.println ("Create Username");
            storedUsername = input.nextLine();

            System.out.println ("Create Password");
            storedPassword = input.nextLine();

            System.out.println("\nAccount created! Please log in.");
        }
        System.out.println("Enter Username: ");
        String enteredUsername = input.nextLine();

        System.out.println("Enter Password: ");
        String enteredPassword = input.nextLine();

        if (enteredUsername.equals(storedUsername) & enteredPassword.equals(storedPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Incorrect username or password. Try again.\n");
        }
        input.close();
    }
}