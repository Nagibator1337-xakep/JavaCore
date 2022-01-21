package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySum {
    public static void main(String[] args) {
        Integer[] array = new Integer[100];

        for (int i=0; i<100; i++) {
            array[i] = i+1;
        }


        List<Integer> arrayList = Arrays.asList(array);
        int maxValue = Collections.max(arrayList);
        int minValue = Collections.min(arrayList);
        int sum = Arrays.stream(array).mapToInt(Integer::intValue).sum();
        int result = sum-maxValue-minValue;
        System.out.println("Result is: "+result);

    }
}
