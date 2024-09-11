package NestClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck{
    private List<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()){
            for (Card.Rank rank : Card.Rank.values()){
                cards.add(new Card(rank,suit));
            }
        }
    }

    public void addCard(Card.Rank rank, Card.Suit suit){
        cards.add(new Card(rank,suit));
    }

    public void removeCard(int index){
//        if(index>=0 && index<cards.size())
            cards.remove(index);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
    public void displayCards(){
        for (int i=0;i<cards.size();i++){
            System.out.println((i+1) + " : " + cards.get(i));
        }
    }

    static class Card{
        private final Rank rank;
        private final Suit suit;

        public Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "rank=" + rank +
                    ", suit=" + suit +
                    '}';
        }

        public enum Rank{
            ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
        }

        public enum Suit{
            HEART,DIAMOND,CLUB,SPADE
        }
    }
}
public class Problem1 {
    public static void main(String[] arg){
        Deck deck= new Deck();
        deck.displayCards();
        deck.shuffle();
        deck.addCard(Deck.Card.Rank.ACE, Deck.Card.Suit.HEART);
        deck.removeCard(54);
        deck.displayCards();
    }
}
