package com.codecool.tinkertailor.iterable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CircularIterable<T> implements Iterable<T> {

    private final List<T> elements;

    public CircularIterable(List<T> elements) {
        this.elements = new LinkedList<>();
        this.elements.addAll(elements);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Iterator<T> wrappedIterator = elements.iterator();

            @Override
            public boolean hasNext() {
                return (elements.size() > 0);
            }

            @Override
            public T next() {
                if (!wrappedIterator.hasNext()) {
                    wrappedIterator = elements.iterator();
                }
                return wrappedIterator.next();
            }

            @Override
            public void remove() {
                wrappedIterator.remove();
            }
        };
    }
}
