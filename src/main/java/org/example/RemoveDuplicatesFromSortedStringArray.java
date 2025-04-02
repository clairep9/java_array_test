package org.example;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedStringArray {
    public static String[] removeDuplicatesFromSortedStringArray(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        if (arr.length == 0) {
            return arr;
        }

        Set<String> uniqueElements = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String str : arr) {
            if (uniqueElements.add(str)) {
                result.append(str).append(" ");
            }
        }

        return result.toString().split(" ");
    }


    public static void main( String[] args )
    {
        String[] arr = {"apple", "apple", "banana", "banana", "cherry", "date", "date", "fig"};

        String[] result = RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr);


    }
}
