package org.example;

public class FindSecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Must have at least 2 unique numbers");
        }

        return secondLargest;
    }


    public static void main( String[] args )
    {
        int[] arr = {10, 5, 20, 15};
        System.out.println(FindSecondLargest.findSecondLargest(arr));


    }

}
