package src;
import java.util.*;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();
    public Random random = new Random();

    private Deck(boolean jokers){
        ArrayList<String> suits = new ArrayList<>(Arrays.asList("clubs","diamonds","spades", "hearts"));
        if (jokers){
            Card joker1 = new Card(15, "hearts");
            Card joker2 = new Card(15, "spades");
            this.deck.addAll(Arrays.asList(joker1, joker2));
        }

        for (int i = 2; i < 15; i++){
            for (int j = 0; j < suits.size(); j++){
                this.deck.add(new Card(i, suits.get(j)));
            }
        }

        this.shakeDeck();
    };

    public static Deck CreateDeck(boolean jokers){
        return new Deck(jokers);
    };

    public Card randomCard(){
        return this.deck.get(random.nextInt(this.deck.size()));
    };

    public void shakeDeck(){
        Collections.shuffle(this.deck, this.random);
    };

//    public void sortDeck() {
//        Collections.sort(this.deck, new Comparator<Deck>() {
//            @Override
//            public int compare(Deck d1, Deck d2) {
//                return (d1);
//            }
//        });
//    }

    public Card takeCard(){
        int index = this.random.nextInt(this.deck.size());
        Card card = this.deck.get(index);
        this.deck.remove(index);
        return card;
    };
    public void returnToDeck(Card card){
        if (this.deck.contains(card))
            System.out.println("The card is already in your deck");
        else
            this.deck.add(card);

    };

    public boolean isEmpty(){ return this.deck.size() == 0; };

    public String toString(){
        String data = new String();
        if (!this.isEmpty()){
            for (Card card: this.deck)
                data += card.toString() + ", ";
        }
        return data;
    };
}