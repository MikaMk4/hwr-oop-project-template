package hwr.oop.cards;

import java.util.ArrayList;
import java.util.Random;

public class Box {

    private ArrayList<Card> cardList;

    public Box(){
        cardList = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        cardList.add(card);
    }


    public ArrayList<Card> getCards() {

        return cardList;
    }

    public Card draw() {
        Random random = new Random();
        int index = random.nextInt(cardList.size());
        return cardList.get(index);
    }
}
