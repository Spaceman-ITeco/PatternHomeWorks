package com.company.adapter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

SequenceGenerator sequenceGenerator = new SequenceGenerator();
   System.out.println(Arrays.toString(sequenceGenerator.generate(5)));
        RandomSequenceAdapter randomSequenceAdapter = new RandomSequenceAdapter();
        System.out.println(Arrays.toString(randomSequenceAdapter.generate(6)));
    }

}
