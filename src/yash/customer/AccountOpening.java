package yash.customer;

import kushal.Customer;

import java.util.Scanner;

public class AccountOpening extends Customer {
    Customer accountOpening = new Customer();
    static String string_name, string_emial, string_address, string_photo, string_phone;
    static Scanner scanner_customer = new Scanner(System.in);

    public void createaccount() {
        System.out.println("Account Registration");
        System.out.println("Enter Customer Name ::");
        string_name = scanner_customer.nextLine();
        accountOpening.setName(string_name);
        System.out.println("Enter Customer Phone ::");
        string_phone=scanner_customer.nextLine();
        accountOpening.setPhone(string_phone);
        System.out.println("Enter Customer Email ID ::");
        string_emial=scanner_customer.nextLine();
        accountOpening.setEmail(string_emial);
        System.out.println("Enter Customer Profile Photo ::");
        string_photo=scanner_customer.nextLine();
        accountOpening.setAccount_photo(string_photo);
        System.out.println("Enter Customer Address ::");
        string_address=scanner_customer.nextLine();
        accountOpening.setAddress(string_address);
    }

    public void updateaccount() {
        int ch = 0;
        System.out.println("Profile Update");
        do {
            System.out.println("Select the Option");
            System.out.println("1. NAME");
            System.out.println("2. Profile Photo");
            System.out.println("3. Address");
            System.out.println("0. Exit");
            System.out.println("Enter your Choice ::");
            ch=scanner_customer.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Update Your Name ::");
                    string_name = scanner_customer.nextLine();
                    accountOpening.setName(string_name);
                    break;
                case 2:
                    System.out.println("Update Customer Profile Photo ::");
                    string_photo=scanner_customer.nextLine();
                    accountOpening.setAccount_photo(string_photo);
                    break;
                case 3:
                    System.out.println("Update Customer Address ::");
                    string_address=scanner_customer.nextLine();
                    accountOpening.setAddress(string_address);
                    break;
            }

        }while (ch!=0);
    }

    public void viewaccount() {
        System.out.println("Customer Details");
        System.out.println("Customer Name :: "+accountOpening.getName());
        System.out.println("Customer Phone :: " +accountOpening.getPhone());
        System.out.println("Customer Email ID :: "+accountOpening.getEmail());
        System.out.println("Customer Profile Photo :: "+accountOpening.getAccount_photo());
        System.out.println("Enter Customer Address :: "+accountOpening.getAddress());
    }


}
