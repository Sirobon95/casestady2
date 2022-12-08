package ComparaTor;

import Prhotel.Hotel;
import Prhotel.ManagerHotel;

import java.io.Serializable;
import java.util.Comparator;

public class SortByIdAndPrice implements Serializable {

    public void sortById() {
        ManagerHotel.hotelList.sort(new CompareById());
        for (Hotel hotel : ManagerHotel.hotelList) {
            System.out.println(hotel.toString());
        }

    }

    public void sortByPrice() {
        ManagerHotel.hotelList.sort(Comparator.comparing(Hotel::getPrice));
        for (int i = ManagerHotel.hotelList.size() - 1; i >= 0; i--) {
            System.out.println(ManagerHotel.hotelList.get(i).toString());

        }
    }
}
