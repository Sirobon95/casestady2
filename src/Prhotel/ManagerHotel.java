package Prhotel;

import iO.ReadAndWrite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerHotel implements Serializable {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Hotel> hotelList = new ArrayList<>();


    static {
        Hotel hotel = new Hotel(888, 1, 300000, "");
        Hotel hotel1 = new Hotel(868, 2, 400000, "");
        Hotel hotel2 = new Hotel(6996, 3, 800000, "");
        hotelList.add(hotel);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        ReadAndWrite.readFile();
    }

    public void disPlay() {
        for (int i = 0; i < hotelList.size(); i++) {
            System.out.println(hotelList.get(i).toString());

        }
    }

    public void addRoom() {
        int id = inputId();
        int type = inputType();
        int price = inputPrice();
        hotelList.add(new Hotel(id, type, price, ""));
        ReadAndWrite.writeFile();
    }

    public int checkId(int id) {
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getId() == id) return i;
        }
        return -1;
    }

    public void editRoom() {
        System.out.println("Enter edit Id.");
        int editId = Integer.parseInt(scanner.nextLine());
        if (checkId(editId) >= 0) {
            for (int i = 0; i < hotelList.size(); i++) {
                if (hotelList.get(i).getId() == editId) {
                    int id = inputId();
                    int type = inputType();
                    int price = inputPrice();
                    String status = inputStatus();
                    hotelList.set(i, new Hotel(id, type, price, status));
                    ReadAndWrite.writeFile();
                }
            }
        } else {
            System.out.println("No is room.");
        }
    }

    public void deleteRoom(int id) {
        if (checkId(id) >= 0) {
            for (int i = 0; i < hotelList.size(); i++) {
                if (hotelList.get(i).getId() == id) {
                    hotelList.remove(i);
                }
            }
        } else {
            System.out.println("No is room.");
        }
    }

    public int inputId() {
        System.out.println("Enter idRoom :");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }


    public int inputPrice() {
        System.out.println("Enter roomPrice :");
        int price = Integer.parseInt(scanner.nextLine());
        return price;
    }

    public int inputType() {
        System.out.println("Enter roomType :");
        while (true) {
            try {
                int type = Integer.parseInt(scanner.nextLine());
                if (type < 0 || type > 3) {
                    throw new NumberFormatException();
                }
                return type;
            } catch (NumberFormatException ex) {
                System.err.println("Please enter the above 3 room types :");
            }
        }
    }

    public String inputName() {
        System.out.println(" Enter Name :");
        String userName = scanner.nextLine();
        return userName;
    }

    public String inputStatus() {
        System.out.println("Enter roomStatus :");
        String status = scanner.nextLine();
        return status;
    }

    public void bookRoom() {
        System.out.println("Book Room.");
        int edId = Integer.parseInt(scanner.nextLine());
        if (checkId(edId) >= 0) {
            for (int i = 0; i < hotelList.size(); i++) {
                if (hotelList.get(i).getId() == edId) {
                    int id = inputId();
                    int type = inputType();
                    int price = inputPrice();
                    String status = inputStatus();
                    String name = inputName();
                    hotelList.set(i, new Hotel(id,type,price,status,name));
                }
            }
        } else {
            System.out.println("No is room.");
        }
    }


}
