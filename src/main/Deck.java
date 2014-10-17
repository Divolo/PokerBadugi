package main;

import java.security.SecureRandom;


/**
 * Created by Dominik on 2014-10-17.
 */
public class Deck {
    public static final int DECK_SIZE = 52;

    private int[] deck = new int[DECK_SIZE];

    SecureRandom Generator = new SecureRandom();

    public int getCard(int player) {
        int candidate = Generator.nextInt(DECK_SIZE);
        while(deck[candidate] != 0) {
            candidate = Generator.nextInt(DECK_SIZE);
        }
        deck[candidate] = player;
        return candidate;
    }
}