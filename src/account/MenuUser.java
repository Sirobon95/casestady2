package account;

import ComparaTor.MenuSort;
import Prhotel.ManagerHotel;
import iO.ReadAndWriteAccount;

import java.io.Serializable;
import java.util.Scanner;

public class MenuUser implements Serializable {
    public static String userName;
    private Scanner scanner = new Scanner(System.in);
    ManagerHotel managerHotel = new ManagerHotel();
    MenuSort menuSort = new MenuSort();

    public void menuUser() {
        ReadAndWriteAccount.readFiles();
        while (true) {
            System.out.println("||=================||");
            System.err.println(" User : ");
            System.out.println("||-----------------||");
            System.out.println(" 1 : Show room. ");
            System.out.println("||-----------------||");
            System.out.println(" 2 : Sort room. ");
            System.out.println("||-----------------||");
            System.out.println(" 3 : Book room. ");
            System.out.println("||-----------------||");
            System.out.println(" 4 : Exit. ");
            System.out.println("||=================||");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerHotel.disPlay();
                    break;
                case 2:
                    menuSort.sortIdPrice();
                    break;
                case 3:
                    managerHotel.bookRoom();
                    break;
                case 4:
                    ReadAndWriteAccount.writeFiles();
                    System.exit(0);
                    break;
                default:
                    System.err.println(" Chiến Xong rồi !!! Trả Phòng à :");
            }
        }
    }
}
