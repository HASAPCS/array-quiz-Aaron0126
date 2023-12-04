package com.example;

public class ArrayOperations {
    // Exercise 1: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        int num=0;
        for(int i:array){
            if (num)
        }
        // TODO: Implement the logic to find the maximum value in the array.
        return value; // Placeholder return value
    }

    // Exercise 2: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int sum=0;
        for (int i : array){
            sum+=i;
        }
        // TODO: Implement the logic to calculate the average of the array elements.
        return sum/array.length; // Placeholder return value
    }

    // Exercise 3: Reverse an Array
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
        int j = array.length - 1-i;
        int temp = array[i];
        array[i]=array[j];
        array[j] = temp;
        }
        // TODO: Implement the logic to reverse the array.
        return array; // Placeholder return value
    }
}
