package com.company.iterator;

import java.util.Iterator;

public class IteratorClass implements Iterator<String> {
    String array[][];
    private String [] strings;
    private int index = 0;

    public IteratorClass(String [] strings)
    {this.strings=strings;}

    public IteratorClass(String[][] array)
    {this.array=array;}

    @Override
    public boolean hasNext() {
        return index<strings.length;
    }

    @Override
    public String next() {
        return strings[index++];
    }
    public Iterator<String> getIterator(int row)
    {return new IteratorClass(array[row]);}
}
