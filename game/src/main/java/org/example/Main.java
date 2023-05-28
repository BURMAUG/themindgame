package org.example;


import org.example.util.CardGenerator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> generatedOneHundredPlayCards = new CardGenerator().generateOneHundredPlayCards();
        for (Integer generatedOneHundredPlayCard : generatedOneHundredPlayCards) {
            System.out.println(generatedOneHundredPlayCard);
        }
    }
}