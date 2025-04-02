package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterEvenNumbers {
    public static int[] filterEvenNumbersFunc(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        int[] result = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            result[i] = evenNumbers.get(i);
        }

        return result;
    }

    public static void main( String[] args )
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] evenNumbers = filterEvenNumbersFunc(arr);
        System.out.println(Arrays.toString(evenNumbers));


    }

}



