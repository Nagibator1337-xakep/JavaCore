package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.digitize(3123123123123L)));
    }

    public static class Kata {
        public static int[] digitize(long n) {
            String s = Long.toString(n);
            int[] array = new int[s.length()];
            for (int i = 0; i<s.length();i++) {
                array[i] = s.charAt(i) - 48;
            }
            return array;
        }
    }
}
