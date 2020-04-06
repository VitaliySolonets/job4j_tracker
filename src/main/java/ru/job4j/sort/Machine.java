package ru.job4j.sort;
/**
 * Сдача в кофемашине.
 */

import java.util.Arrays;

public class Machine {
    private final int[] cOINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        for (int i = 0; i < cOINS.length; i++) {
            while (sum > 0) {
                if (sum - cOINS[i] < 0) {
                    continue;
                } else {
                    sum = sum - cOINS[i];
                    rsl[size++] = cOINS[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
