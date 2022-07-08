package com.company.strategy;

public class RandomIntArray {
    private final int max = 299;//2147483647;
    private final int min = 1;
    private final int range = max - min + 1;
    private final int b = (int) (Math.random() * range);
    private final int[] array = new int[b];

    public int[] randomArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * range));
        }
        return array;
    }
}
