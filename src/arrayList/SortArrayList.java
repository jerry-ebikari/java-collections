package arrayList;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {
    static <T extends Comparable<T>> void sort(ArrayList<T> arrayList) {
        if (arrayList == null) return;
        arrayList.sort(Comparable::compareTo);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Jerry", "Ebikari", "Needam", "James", "Bond"));
        sort(names);
        System.out.println(names);
    }
}
