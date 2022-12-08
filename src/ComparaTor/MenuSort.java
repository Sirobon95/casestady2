package ComparaTor;

import Prhotel.ManagerHotel;
import iO.ReadAndWrite;

import java.io.Serializable;
import java.util.Scanner;

public class MenuSort implements Serializable {
    Scanner scanner = new Scanner(System.in);
    ManagerHotel managerHotel = new ManagerHotel();
    SortByIdAndPrice sortByIdAndPrice = new SortByIdAndPrice();

    public void sortIdPrice() {
        ReadAndWrite.readFile();
        while (true) {
            System.out.println("||====================||");
            System.out.println(" 1 : Display.");
            System.out.println("||--------------------||");
            System.out.println(" 2 : Sort by Id.");
            System.out.println("||--------------------||");
            System.out.println(" 3 : Sort by Price.");
            System.out.println("||--------------------||");
            System.out.println(" 4 : Exit.");
            System.out.println("||====================||");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerHotel.disPlay();
                    break;
                case 2:
                    sortByIdAndPrice.sortById();
                    break;
                case 3:
                    sortByIdAndPrice.sortByPrice();
                    break;
                case 4:
                    System.exit(0);
                    return;
                default:
                    System.err.println("Ơ kìa không sắp xếp à ! ");
            }
        }
    }
}
