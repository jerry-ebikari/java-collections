package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIteration {
    static <T> void printElementsWithForEach(ArrayList<T> arrayList) {
        arrayList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(
                Arrays.asList("apple", "banana", "pineapple", "orange")
        );
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Fruits");
        printElementsWithForEach(fruits);
        System.out.println("\nNumbers");
        printElementsWithForEach(numbers);
    }
}
