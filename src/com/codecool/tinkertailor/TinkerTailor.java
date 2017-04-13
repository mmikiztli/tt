package com.codecool.tinkertailor;

import java.util.*;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List execute() {
        List<Integer> children = new ArrayList<Integer>();
        List<Integer> outcome = new ArrayList<Integer>();

        for (int i = 1; i <= this.n; i++) {
            children.add(i);
        }
        int counter = 0;
        while (children.size() > 0) {
        for (Iterator<Integer> iterator = children.iterator(); iterator.hasNext(); ) {
            counter++;
            int value = iterator.next();
            if (counter == this.k) {
                iterator.remove();
                outcome.add(value);
                counter = 0;
            }
        }}

        return outcome;
    }
}