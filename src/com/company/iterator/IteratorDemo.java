package com.company.iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        String array[][] = new String[][]{{"John", "Mary"}, {"Alice", "Bob"}, {"Den"}, {"Test", "Ruslan", "Java"}};
        IteratorClass iteratorClass = new IteratorClass(array);
        for (int i = 0; i < array.length; i++) {
            Iterator<String> iterator = iteratorClass.getIterator(i);
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        }
    }
}
