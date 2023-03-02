package arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {
    static <T extends Comparable<T>> void sort(ArrayList<T> arrayList) {
        if (arrayList == null) return;
        arrayList.sort(Comparator.naturalOrder());
    }

    static <T extends Comparable<T>> void sort(ArrayList<T> arrayList, String order) {
        if (arrayList == null) return;
        if (order == null || !order.equals("desc")) {
            arrayList.sort(Comparator.naturalOrder());
        } else {
            arrayList.sort(Comparator.reverseOrder());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Jerry", "Ebikari", "Needam", "James", "Bond"));
        sort(names);
        System.out.println(names);
        sort(names, "desc");
        System.out.println(names);
    }
}
