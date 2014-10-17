package main;

/**
 * Created by Dominik on 2014-10-17.
 */
public class TEST {

    public static void main(String[] args) {
        Deck NewDeck = new Deck();
        int myDeck [] = new int[52];
        for(int i = 0; i < 52; i++) {
            myDeck[i] = NewDeck.getCard(1);
        }
        for(int i = 0; i < 52; i++) {
            System.out.println(i + " - - " + Card.getString(myDeck[i]/13, myDeck[i]%13));
        }
    }
}
