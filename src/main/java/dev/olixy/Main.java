package dev.olixy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int findBigUnique(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int bigUnique = -1;

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int number = entry.getKey();
            int occurrences = entry.getValue();

            if (occurrences == 1) {
                if (number > bigUnique) {
                    bigUnique = number;
                }
            }
        }

        return bigUnique;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 7, 3, 3, 4, 4, 8, 8, 9};
        System.out.println(findBigUnique(arr));
    }
}