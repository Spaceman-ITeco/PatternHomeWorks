package com.company.adapter;



public class RandomSequenceAdapter extends RandomGenerator implements IntAdapter{

    @Override
    public int[] generate(int length) {
        int[] randomArray = new int[length];
        for (int i =0;i<length;i++) {
            RandomGenerator randomGenerator = new RandomGenerator();
            randomArray[i] = randomGenerator.getRandomNumber();
        }
        return randomArray;
    }
}
