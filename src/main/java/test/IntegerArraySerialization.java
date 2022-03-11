package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class IntegerArraySerialization {
    public static void main(String[] args) {
        int[] testArray = new int[200];

        // Getting an array of random integers in the range of 1 to 1000, length is 200 elements
        for (int i = 0; i < 200; i++) {
            testArray[i] = getRandomNumber(1, 1000);
        }

        // Visualisation of Results:
        // Sorting original Array
        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));

        // Serializing
        String stringArray = serializeIntArray(testArray);
        System.out.println(stringArray);

        // Deserializing
        int[] deserArray = deserializeStringToArray(stringArray);
        System.out.println(Arrays.toString(deserArray));

    }

    // Helper method to get random int number in the range
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max + 1 - min)) + min);
    }

    // Serializing int array into a String
    // Array is getting sorted beforehand
    // Duplicate values are presented as NxNUMBER where N is how many times NUMBER repeats in a String
    public static String serializeIntArray(int[] array) {
        StringBuilder b = new StringBuilder();
        Arrays.sort(array);

        // No of duplicates in array in a group of repeating numbers
        int duplicate = 1;

        // Current element of array, preset to first element
        int current = array[0];

        // Iterating through sorted array, incrementing duplicate number if current element is equal to the next one
        // Appending StringBuffer with current array element if duplicate number is 1
        // Appending with NxINT if duplicate number > 1
        // except for the last element/group (if there are repeating elements at the end)
        for (int i = 1; i < array.length; i++) {
            if (current == array[i]) {
                duplicate++;
            } else {
                if (duplicate == 1) b.append(current).append(" ");
                else {
                    b.append(duplicate).append("x").append(current).append(" ");
                    duplicate = 1;
                }
                current = array[i];
            }
        }

        // Appending StringBuffer with the last element/group (if there are repeating elements at the end)
        if (duplicate == 1) b.append(current);
        else b.append(duplicate).append("x").append(current);

        return b.toString();
    }

    // Deserializing a String into an int[] Array
    public static int[] deserializeStringToArray(String intString) {
        // String is being split by spacer (" ") into an ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(intString.split(" ")));
        String[] pair;
        int listSize = list.size();

        // ArrayList is being iterated over
        for (int i = 0; i < listSize; i++) {
            String str = list.get(i);

            // All elements containing "x" (duplicate numbers) are split into a Number of reps and a Number to repeat
            if (str.contains("x")) {
                pair = str.split("x");
                int numRep = Integer.parseInt(pair[0]);

                // All repeated numbers then added to the end of the List, original duplicates replaced with null
                for (int j = 0; j < numRep; j++) {
                    list.add(listSize,pair[1]);
                }
                list.set(i,null);
            }
        }
        // Null values then removed, list sorted and transformed into and int[] Array
        list.removeIf(Objects::isNull);
        return list.stream().mapToInt(Integer::parseInt).sorted().toArray();

    }
}
