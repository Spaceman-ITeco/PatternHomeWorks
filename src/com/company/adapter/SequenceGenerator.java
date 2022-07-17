package com.company.adapter;

import java.util.Random;

public class SequenceGenerator {
    public int [] generate (int length)
    {
        Random rd = new Random();
        int [] arr = new int [length];
        for (int i=0;i<arr.length;i++)
        {arr[i]= rd.nextInt();}
        return arr;
    }
}
