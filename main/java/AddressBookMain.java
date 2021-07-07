import java.util.Scanner;

public class AddressBookMain {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");

        System.out.println("------Add a contact------");
        System.out.println("Please enter the contact first name");
        String firstName=input.next();
        System.out.println("Please enter the contact last name");
        String lastName=input.next();
        System.out.println("Please enter the contact address");
        String address=input.next();
        System.out.println("Please enter the contact city");
        String city=input.next();
        System.out.println("Please enter the contact state");
        String state=input.next();
        System.out.println("Please enter the contact zipCode");
        String zipCode=input.next();
        System.out.println("Please enter the contact phoneNumber");
        String phoneNumber=input.next();
        System.out.println("Please enter the contact email");
        String email=input.next();

        Contacts contacts = new Contacts(firstName, lastName, address, city, state, zipCode,
                phoneNumber, email);
        System.out.println(contacts.toString());

    }
}
