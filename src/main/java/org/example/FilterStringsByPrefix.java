package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterStringsByPrefix {
    public static String[] filterStringsByPrefix(String[] arr, String prefix) {
        if (arr == null || prefix == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        ArrayList<String> resultArrayList = new ArrayList<>();

        for (String str : arr) {
            if (str.startsWith(prefix)) {
                resultArrayList.add(str);
            }
        }

        String[] resultArray = resultArrayList.toArray(new String[0]);

        return resultArray;
    }

    public static void main( String[] args )
    {
        String[] arr = {"apple", "apricot", "banana", "ant", "art"};
        String prefix = "ap";

        String[] filteredStrings = FilterStringsByPrefix.filterStringsByPrefix(arr, prefix);

        System.out.println("Filtered strings: " + Arrays.toString(filteredStrings));


    }
}
