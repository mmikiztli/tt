package com.codecool.tinkertailor;


import com.codecool.tinkertailor.iterable.TinkerTailorIterableImpl;
import com.codecool.tinkertailor.lists.TinkerTailorArrayImpl;
import com.codecool.tinkertailor.lists.TinkerTailorLinkedImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class TinkerTailorTest {

    private TinkerTailor game;
    private List<Integer> expected;

    public TinkerTailorTest(TinkerTailor game, List<Integer> expected) {
        this.game = game;
        this.expected = expected;
    }

    @Test
    public void shouldReturnExpected() {
        assertThat(game.execute(), is(expected));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> instancesToTest() {
        return Arrays.asList(
                new Object[]{new TinkerTailorArrayImpl(5,1), Arrays.asList(1,2,3,4,5)},
                new Object[]{new TinkerTailorArrayImpl(5,3), Arrays.asList(3,1,5,2,4)},
                new Object[]{new TinkerTailorLinkedImpl(5,1), Arrays.asList(1,2,3,4,5)},
                new Object[]{new TinkerTailorLinkedImpl(5,3), Arrays.asList(3,1,5,2,4)},
                new Object[]{new TinkerTailorIterableImpl(5, 1), Arrays.asList(1, 2, 3, 4, 5)},
                new Object[]{new TinkerTailorIterableImpl(5,3), Arrays.asList(3,1,5,2,4)});
    }

}
