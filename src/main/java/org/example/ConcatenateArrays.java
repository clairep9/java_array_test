package org.example;


import java.util.Arrays;

public class ConcatenateArrays {
    public static int[] concatenateArraysFunc(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Error: null array");
        }

        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }


    public static void main( String[] args )
    {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = concatenateArraysFunc(arr1, arr2);
        System.out.println(Arrays.toString(result));


    }

}
