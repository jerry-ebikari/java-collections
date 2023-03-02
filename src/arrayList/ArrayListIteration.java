package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {
    static <T> void printElementsWithForEach(ArrayList<T> arrayList) {
        if (arrayList == null) return;
        arrayList.forEach(System.out::println);
    }

    static <T> void printElementsWithIterator(ArrayList<T> arrayList) {
        if (arrayList == null) return;
        Iterator<T> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>( Arrays.asList("apple", "banana", "pineapple", "orange") );
        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5) );
        System.out.println("Fruits");
        printElementsWithIterator(fruits);
        System.out.println("\nNumbers");
        printElementsWithIterator(numbers);
    }
}
