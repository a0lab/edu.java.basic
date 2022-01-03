package edu.java.basic;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayUtil {

    public static int max(int[] list) {
        int big = list[0];
        for (int element : list) {
            if (big < element) {
                big = element;
            }
        }
        return big;
    }

    public static void print(int[] list) {
        for (int element : list) {
            System.out.println(element);
        }
    }

    public static void printWithLabelWithFor(int[] list) {
        for (int j = 0; j < list.length; j++) {
            System.out.println("b Element " + (j + 1) + ": " + list[j]);
        }
    }

    public static void printWithLabelWithForEach(int[] list) {
        int i = 0;
        for (int element : list) {
            System.out.println("a Element " + (++i) + ": " + element);
        }
    }

    public static void printWithLabel(ArrayList<Integer> list) {
        int i = 0;

        // for each
        for (int element : list) {
            System.out.println("Element " + ++i + ": " + element);
        }
    }

    public static void printWithLabelUsingLambda(ArrayList<Integer> list) {
        AtomicInteger i = new AtomicInteger();
        i.getAndIncrement();
        list.forEach((element) -> {
            System.out.println("Element " + i.getAndIncrement() + ": " + element);
        });
    }


    public static int indexOfBiggestNumber(int[] intArray) {
        int bigIndex = 0;
        int bigNumber = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (bigNumber < intArray[i]) {
                bigNumber = intArray[i];
                bigIndex = i;
            }
        }
        return bigIndex;
    }

    public static int[] indexOfBiggestThreeNumbers(int[] inputArray) {
        int bigIndex[] = {0, 0, 0};
        int bigNumber[] = {0, 0, 0};
        int[] intArray = inputArray.clone();
        for (int i = 0; i < intArray.length; i++) {
            if (bigNumber[0] < intArray[i]) {
                bigNumber[0] = intArray[i];
                bigIndex[0] = i;
            }
        }
        intArray[bigIndex[0]] = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (bigNumber[1] < intArray[i]) {
                bigNumber[1] = intArray[i];
                bigIndex[1] = i;
            }
        }
        intArray[bigIndex[1]] = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (bigNumber[2] < intArray[i]) {
                bigNumber[2] = intArray[i];
                bigIndex[2] = i;
            }
        }
        return bigIndex;
    }
}
