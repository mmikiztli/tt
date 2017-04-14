package com.codecool.tinkertailor;

import java.util.List;

public abstract class TinkerTailor {

    protected final int n;
    protected final int k;

    public TinkerTailor(int n, int k) {
        if ((n <= 0) || (k <= 0))  {
            throw new IllegalArgumentException("n and k must be positive");
        }
        this.n = n;
        this.k = k;
    }

    public abstract List<Integer> execute();

}
