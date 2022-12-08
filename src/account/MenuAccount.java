package account;

import iO.ReadAndWriteAccount;

import java.io.Serializable;
import java.util.Scanner;

public class MenuAccount implements Serializable {
    ManagerAccount managerAccount = new ManagerAccount();
    private Scanner scanner = new Scanner(System.in);

    public void menuAccount1() {
        ReadAndWriteAccount.readFiles();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("||=================||");
            System.out.println("1 : Register. ");
            System.out.println("||-----------------||");
            System.out.println("2 : Login. ");
            System.out.println("||-----------------||");
            System.out.println("3 : ChangePassword. ");
            System.out.println("||-----------------||");
            System.out.println("4 : Exit. ");
            System.out.println("||=================||");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerAccount.registerAccount();
                    break;
                case 2:
                    managerAccount.loginAccount();
                    break;
                case 3:
                    menuChangePassword();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please enter the option above.");
                    break;
            }
        }
    }

    public void menuChangePassword() {
        ReadAndWriteAccount.readFiles();
        String userName;
        System.out.println("||==================||");
        System.out.println(" 1 : changePassword. ");
        System.out.println("||------------------||");
        System.out.println(" 2 : disPlay. ");
        System.out.println("||------------------||");
        System.out.println(" 0 : Exit. ");
        System.out.println("||==================||");
        int choice = Integer.parseInt(scanner.nextLine());
        ;
        switch (choice) {
            case 1:
                System.out.println("Input edit Id :");
                userName = scanner.nextLine();
                managerAccount.changePassword(userName);
                break;
            case 2:
                managerAccount.disPlay();
                return;
            case 0:
                ReadAndWriteAccount.writeFiles();
                System.exit(0);
                return;
        }
    }
}


