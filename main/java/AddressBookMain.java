import java.util.Scanner;

public class AddressBookMain {
    static Scanner input=new Scanner(System.in);
    static int max_contacts = 100;
    static int current_contacts_counts = 0;
    static Contacts[] contacts = new Contacts[max_contacts];
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");

        while(true) {
            Menu();
            System.out.println("Enter your selection");
            int selection = input.nextInt();
            if(selection < 1 || selection > 7) {
                System.out.println("Please enter the number in the menu");
                continue;
            }

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
    }

    public static void Menu() {
        System.out.println("------------------------------------------");
        System.out.println("| 1. Add contact |");
        System.out.println("| 2. Delete contact |");
        System.out.println("| 3. Modify contact |");
        System.out.println("| 4. Search for a contact |");
        System.out.println("| 5. Show all contacts |");
        System.out.println("| 6. Exit |");
        System.out.println("------------------------------------------");
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
        System.out.println("------Modify contact information------");
        System.out.println("Please enter the contact first name");
        String name=input.next();
        int index = getIndex(name);
        if(-1 == index) {
            System.out.println("Contact does not exist");
        }else {
            System.out.println("Name:"+contacts[index].getFirstName()+"Please enter a new contact first name");
            String firstName = input.next();
            contacts[index].setFirstName(firstName);
            System.out.println("Name:"+contacts[index].getLastName()+"Please enter a new contact full name");
            String lastName = input.next();
            contacts[index].setLastName(lastName);
            System.out.println("Name:"+contacts[index].getAddress()+"Please enter the new contact address");
            String address = input.next();
            contacts[index].setAddress(address);
            System.out.println("Name:"+contacts[index].getCity()+"Please enter a new contact city");
            String city = input.next();
            contacts[index].setCity(city);
            System.out.println("Name:"+contacts[index].getState()+"Please enter a new contact state");
            String state = input.next();
            contacts[index].setState(state);
            System.out.println("Name:"+contacts[index].getZipCode()+"Please enter a new contact zip code");
            String zipCode = input.next();
            contacts[index].setZipCode(zipCode);
            System.out.println("Name:"+contacts[index].getPhoneNumber()+"Please enter a new contact phone number");
            String phoneNumber = input.next();
            contacts[index].setPhoneNumber(phoneNumber);
            System.out.println("Name:"+contacts[index].getEmail()+"Please enter a new contact phone number");
            String email = input.next();
            contacts[index].setEmail(email);

        }
    }

    private static void del() {
        System.out.println("------Delete a contact------");
        System.out.println("Please enter the contact first name");
        String name=input.next();
        int index = getIndex(name);
        if(-1 == index) {
            System.out.println("Contact does not exist");
        }else {
            contacts[index]=contacts[current_contacts_counts-1];
            current_contacts_counts--;
            System.out.println("successfully deleted");
        }
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

        contacts[current_contacts_counts] = new Contacts(firstName, lastName, address, city, state, zipCode,
                phoneNumber, email);

        System.out.println(contacts[0].toString());
    }

    public static int getIndex(String firstName) {
        for(int i = 0; i < current_contacts_counts; i++) {
            if(contacts[i].getFirstName().equals(firstName)) {
                return i;
            }
        }
        return -1;
    }
}

