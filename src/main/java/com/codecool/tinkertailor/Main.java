package com.codecool.tinkertailor;

import com.codecool.tinkertailor.lists.TinkerTailorArrayImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    TinkerTailor tinkerTailor = new TinkerTailorArrayImpl(5,3);
	    List<Integer> outcome = tinkerTailor.execute();
	    System.out.println("The outcome of the game is: " + outcome);
    }
}
