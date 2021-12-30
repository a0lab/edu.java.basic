package edu.java.basic;

public class GArrayUtil {

    public static <E extends Comparable<E>> E max(E[] list) {

        E big = list[0];

        for (E element : list) {
            if (big.compareTo(element) < 0) {
                big = element;
            }
        }
        return big;
    }

    public static <E extends Comparable<E>> E min(E[] list) {

        E small = list[0];

        for (E element : list) {
            if (small.compareTo(element) > 0) {
                small = element;
            }
        }
        return small;
    }

    public static <E extends Comparable<E>> void printArray(E[] list) {
        System.out.print("Print Array { ");
        for (E element : list) {
            System.out.print(element + ", ");
        }
        System.out.println("}");
    }
}
