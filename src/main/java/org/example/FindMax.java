package org.example;

public class FindMax {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static void main( String[] args )

    {
        int[] arr = {5, 2, 9, 1, 5};
        System.out.println(FindMax.findMax(arr));

    }
}
