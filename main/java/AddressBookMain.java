import java.util.Scanner;

public class AddressBookMain {
    private static final Contacts[] contacts = null;
    static Scanner input=new Scanner(System.in);
    static int max_contacts = 100;
    static int current_contacts_counts = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        Menu();
    }

    public static void Menu() {
        System.out.println("            ");
        System.out.println("------Communication Management System------");
        System.out.println("| 1. Add contact |");
        System.out.println("| 2. Delete contact |");
        System.out.println("| 3. Modify contact |");
        System.out.println("| 4. Search for a contact |");
        System.out.println("| 5. Show all contacts |");
        System.out.println("| 6. Exit |");
        System.out.println("------------------------------------------");
        System.out.println("Enter your selection");
        int selection = input.nextInt();
        switch (selection){
            case 1:
                add();
                break;
            case 2:
                del();
                break;
            case 3:
                upDate();
                break;
            case 4:
                look();
                break;
            case 5:
                lookAll();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Invalid selection");
        }
    }

    private static void exit() {
        System.out.println("Invalid selection");
    }

    private static void lookAll() {
        System.out.println("LookAll operation");
    }

    private static void look() {
        System.out.println("Update operation");
    }

    private static void upDate() {
        System.out.println("Update operation");
    }

    private static void del() {
        System.out.println("Delete operation");
    }

    public static void add() {
        System.out.println("------Add a contact------");
        System.out.println("Please enter the contact first name");
        String firstName = input.next();
        System.out.println("Please enter the contact last name");
        String lastName = input.next();
        System.out.println("Please enter the contact address");
        String address = input.next();
        System.out.println("Please enter the contact city");
        String city = input.next();
        System.out.println("Please enter the contact state");
        String state = input.next();
        System.out.println("Please enter the contact zipCode");
        String zipCode = input.next();
        System.out.println("Please enter the contact phoneNumber");
        String phoneNumber = input.next();
        System.out.println("Please enter the contact email");
        String email = input.next();

        Contacts contacts = new Contacts(firstName, lastName, address, city, state, zipCode,
                phoneNumber, email);

        System.out.println(contacts.toString());
    }
}

