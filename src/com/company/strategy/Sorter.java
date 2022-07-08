package com.company.strategy;

import java.util.Arrays;

public class Sorter {
    private SortingStrategy sortingStrategy;
    RandomIntArray randomIntArray = new RandomIntArray();
    int [] array = randomIntArray.randomArray();

    private void defineStrategy()
    {
        if(array.length<100)
    {
        sortingStrategy = new BubbleSortingStrategy();
        System.out.println("BubbleSortingStrategy");
    }
    else
    {
        sortingStrategy = new MergeSortingStrategy();
        System.out.println("MergeSortingStrategy");
    }

    }
    public void result(){
        System.out.println("Array length: " + array.length);
        System.out.println(Arrays.toString(array));
        defineStrategy();
        sortingStrategy.sort(array);

    }
}
