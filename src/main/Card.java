
package main;

/**
 * Created by Dominik on 2014-10-17.
 */
public abstract class Card {

    private static String[] suits = {"hearts", "spades", "diamonds", "clubs"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static String getString (int suit, int rank) {
        return (ranks[rank] + " of " + suits[suit]);
    }

    public static String getSuit(int suit){
        return suits[suit];
    }

    public static String getRank(int rank){
        return ranks[rank];
    }

}
