package org.example.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * <h1>Card Generator</h1>
 * <p>The class should generate a list of one hundred</p>
 * <p>The class should shuffle it and according to the number of players we need to distribute to each player by level</p>
 *
 *
 */
public class CardGenerator {
    private ArrayList<Integer> generalCards;
    private Random random;
    public CardGenerator() {
    }

    public ArrayList<Integer> generateOneHundredPlayCards(){
        generalCards = new ArrayList<>();
        for (int i = 0; i <= 99; i++)
            generalCards.add(i+1);
        return shufflePlayGeneralCards(generalCards);
    }

    private ArrayList<Integer> shufflePlayGeneralCards(ArrayList<Integer> generalCards){

        return generalCards;
    }
}
