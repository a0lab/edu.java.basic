package edu.java.basic;

public class DataStructure {

    public void ArrayExample() {
        // create an array
        int[] age = {12, 4, 7, 2, 5};
        int[] ageSorted = new int[5];
        String[] name = {"Jayaraman", "Sridhar", "Mohan", "Anand", "Mariamman", "Ganapathy", "Murugan"};

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        for (int i=0 ; i<name.length; i++)
            System.out.println(i+1 +  " " + name[i]);

    }

    public void ArrayCSVExample() {
        // create an array
        int[] age = {12, 4, 7, 2, 5};
        int[] ageSorted = new int[5];
        String[] nameList = {"Jayaraman", "Sridhar", "Mohan", "Anand", "Mariamman", "Ganapathy", "Murugan"};

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        for (int i=0 ; i<nameList.length; i++)
            System.out.println(i+1 +  " " + nameList[i]);

        System.out.println("Print array using for each");
        // Print the list of names with comma separated using for each
        for(String name : nameList) {
            System.out.print(name);
            if (!name.equalsIgnoreCase(nameList[nameList.length-1]))
                System.out.print(", ");

        }
        System.out.println();
        System.out.println("Print array using for index");
        // Print the list of names with comma separated using for index
        for(int i=0; i<nameList.length; i++) {
            System.out.print(nameList[i]);
            if (i != nameList.length-1)
                System.out.print(", ");

        }
    }
}
