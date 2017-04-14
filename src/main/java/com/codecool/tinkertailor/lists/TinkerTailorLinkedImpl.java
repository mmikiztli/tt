package com.codecool.tinkertailor.lists;

import com.codecool.tinkertailor.TinkerTailor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TinkerTailorLinkedImpl extends TinkerTailor {

    public TinkerTailorLinkedImpl(int n, int k) {
        super(n, k);
    }

    @Override
    public List<Integer> execute() {
        List<Integer> outcome = new ArrayList<>(n);
        List<Integer> children = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            children.add(i);
        }

        int counter = 0;
        while (children.size() > 0) {
            for (Iterator<Integer> iterator = children.iterator(); iterator.hasNext(); ) {
                counter += 1;
                int value = iterator.next();
                if (counter == k) {
                    counter = 0;
                    outcome.add(value);
                    iterator.remove();
                }
            }
        }

        return outcome;
    }

}
