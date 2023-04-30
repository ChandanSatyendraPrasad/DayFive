package abhi;

import yash.customer.AccountOpening;

import java.util.Scanner;

public class GeloBank extends AccountOpening {
    static int choice;
    public static void main(String[] args) {
        GeloBank geloBank = new GeloBank();
        do {
            System.out.println("Welcome Welcome GeLo BaNk");
            System.out.println("1. Create Customer Account");
            System.out.println("2. Update Customer Account");
            System.out.println("3. View Customer Account");
            System.out.println("0. Exit Customer Service");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice ::");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1 :
                    geloBank.createaccount();
                    break;
                case 2:
                    geloBank.updateaccount();
                    break;
                case 3:
                    geloBank.viewaccount();
                    break;

            }
        }while (choice!=0);
        geloBank.createaccount();

    }
}
