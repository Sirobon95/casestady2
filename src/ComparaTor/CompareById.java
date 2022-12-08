package ComparaTor;

import Prhotel.Hotel;

import java.util.Comparator;

public class CompareById implements Comparator<Hotel> {
    @Override
    public int compare(Hotel o1, Hotel o2) {
        return o1.getId() - o2.getId();
    }

}
