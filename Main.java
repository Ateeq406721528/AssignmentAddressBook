package Assignment_Week_06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook addressBook = new ContactBook();


            System.out.println("Address Book Menu:");

            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    addressBook.addContact( name, phoneNumber, email);
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter Name to delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;
                case 4:
                    System.out.println("Exiting Contact Book: Program Finished");

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

    }
}
