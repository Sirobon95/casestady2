package Prhotel;

import ComparaTor.MenuSort;
import iO.ReadAndWrite;

import java.io.Serializable;
import java.util.Scanner;

public class MenuHotel implements Serializable {
    Scanner scanner = new Scanner(System.in);
    private Hotel hotel;

    public void Menu() {
        ManagerHotel managerHotel = new ManagerHotel();
        MenuSort menuSort = new MenuSort();
        ReadAndWrite.readFile();
        while (true) {
            System.out.println("||======================||");
            System.err.println(" Menu");
            System.out.println("||----------------------||");
            System.out.println(" 1 : Show roomHotel. ");
            System.out.println("||----------------------||");
            System.out.println(" 2 : Add roomHotel. ");
            System.out.println("||----------------------||");
            System.out.println(" 3 : Edit room. ");
            System.out.println("||----------------------||");
            System.out.println(" 4 : Delete room. ");
            System.out.println("||----------------------||");
            System.out.println(" 5 : Sort room. ");
            System.out.println("||----------------------||");
            System.out.println(" 6 : Log out. ");
            System.out.println("||----------------------||");
            System.out.println(" 0 : Exit. ");
            System.out.println("||======================||");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    managerHotel.disPlay();
                    break;
                case 2:
                    managerHotel.addRoom();
                    break;
                case 3:
                    managerHotel.editRoom();
                    break;
                case 4:
                    System.out.println("Enter id Delete.");
                    int id = Integer.parseInt(scanner.nextLine());
                    managerHotel.deleteRoom(id);
                    break;
                case 5:
                    menuSort.sortIdPrice();
                    break;
                case 6:
                    ReadAndWrite.writeFile();
                    return;
                case 0:
                    System.exit(0);
                default:
                    System.err.println(" Just choose the others Bon :");
            }
        }
    }
}
