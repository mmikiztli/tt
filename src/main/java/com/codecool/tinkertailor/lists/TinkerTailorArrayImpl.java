package com.codecool.tinkertailor.lists;

import com.codecool.tinkertailor.TinkerTailor;

import java.util.*;

public class TinkerTailorArrayImpl extends TinkerTailor {

    public TinkerTailorArrayImpl(int n, int k) {
        super(n, k);
    }

    @Override
    public List<Integer> execute() {
        List<Integer> outcome = new ArrayList<>(n);
        List<Integer> children = new ArrayList<>(n);

        for (int i = 1; i <= this.n; i++) {
            children.add(i);
        }

        int counter = 0;
        while (children.size() > 0) {
            counter += this.k - 1;
            int out = counter % children.size();
            outcome.add(children.remove(out));
            counter = out;
        }

        return outcome;
    }
}