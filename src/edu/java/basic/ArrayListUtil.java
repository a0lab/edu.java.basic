package edu.java.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUtil {

    public static void simpleUseOfArrayList() {
        // Java program to demonstrate the
        // working of ArrayList in Java
        //Declaration of Array List
        ArrayList<String> fruitList = new ArrayList<>();
        // Size of the
        // ArrayList
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Pineapple");

        // Printing elements
        System.out.println(fruitList);

        // Remove element at index 3
        fruitList.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(fruitList);

        //Remove element using the name
        fruitList.remove("Mango");
        System.out.println(fruitList);
        fruitList.add(2, "Mango");


        // Printing elements one by one
        for (int i = 0; i < fruitList.size(); i++)
            System.out.print(fruitList.get(i) + " ");

        System.out.println();
        // Get element at index 2 and print it
        System.out.println(fruitList.get(2));

        // add some more elements
        fruitList.add("Watermelon");
        fruitList.add("Lime");
        fruitList.add("Strawberries");
        fruitList.add("Apricots");
        fruitList.add("Plums");
        fruitList.add("Grapes");

        //Print array list after adding additional elements
        System.out.println("Print full list after adding it");
        System.out.println("-------------------------------");
        System.out.println(fruitList);

        //Replace an item using set method
        int orangeIndex = fruitList.indexOf("Orange");
        fruitList.set(orangeIndex, "Kamala Orange");

        System.out.println("Aftr adding Kamala orange");
        System.out.println("-------------------------------");
        System.out.println(fruitList);

        int mangoIndex = fruitList.indexOf("Mango");
        fruitList.add(mangoIndex+1, "Imam Pasandu");
        System.out.println(fruitList);
    }

    public static void printUsingIterator() {
        // Java program to demonstrate the
        // working of ArrayList in Java
        //Declaration of Array List
        ArrayList<String> fruitList = new ArrayList<>();
        // Size of the
        // ArrayList
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Pineapple");

        // add some more elements
        fruitList.add("Watermelon");
        fruitList.add("Lime");
        fruitList.add("Strawberries");
        fruitList.add("Apricots");
        fruitList.add("Plums");
        fruitList.add("Grapes");


        Iterator itr = fruitList.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Printing elements
        // System.out.println(fruitList);
    }
}
