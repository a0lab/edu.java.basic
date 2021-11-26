package edu.java.basic;

public class ArrayUtil {

    public static int indexOfBiggestNumber(int[] intArray) {
        int bigIndex = 0;
        int bigNumber = intArray[0];
        for (int i=1 ; i<intArray.length; i++) {
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
        for (int i=0 ; i<intArray.length; i++) {
            if (bigNumber[0] < intArray[i]) {
                bigNumber[0] = intArray[i] ;
                bigIndex[0] = i;
            }
        }
        intArray[bigIndex[0]] = 0 ;
        for (int i=0 ; i<intArray.length; i++) {
            if (bigNumber[1] < intArray[i]) {
                bigNumber[1] = intArray[i];
                bigIndex[1] = i;
            }
        }
        intArray[bigIndex[1]] = 0 ;
        for (int i=0 ; i<intArray.length; i++) {
            if (bigNumber[2] < intArray[i]) {
                bigNumber[2] = intArray[i];
                bigIndex[2] = i;
            }
        }
        return bigIndex;
    }
}
