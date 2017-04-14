package com.codecool.tinkertailor.iterable;

import com.codecool.tinkertailor.TinkerTailor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TinkerTailorIterableImpl extends TinkerTailor {

    private final List<Integer> children;

    public TinkerTailorIterableImpl(int n, int k) {
        super(n, k);

        this.children = new ArrayList<>(n);
        for (int i = 1; i <= this.n; i++) {
            children.add(i);
        }
    }

    @Override
    public List<Integer> execute() {
        CircularIterable<Integer> circle = new CircularIterable<>(children);
        Iterator<Integer> count = circle.iterator();

        List<Integer> outcome = new ArrayList<>(n);

        while (count.hasNext()) {
            for (int i = 0; i < this.k - 1; i++) {
                count.next();
            }
            outcome.add(count.next());
            count.remove();
        }

        return outcome;
    }
}
