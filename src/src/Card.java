package src;
import java.util.Arrays;
import java.util.Objects;

public class Card {
    private int rank;
    private String suit;
    public static int maxRank;

    Card(int rank, String suit)
    {
        this.suit = suit;
        String [] data = {"diamonds","clubs", "hearts", "spades"};
        if (Arrays.asList(data).contains(suit)==false)
            System.out.println("Wrong suit value");
        if (this.rank>maxRank)
            maxRank = this.rank;
        else
            this.rank = rank;
    }
    Card(String suit)
    {
        this.suit = suit;
        this.rank = maxRank+1;
    }
    public int getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String [] data = {"Jack", "Queen", "King", "Ace", "Joker"};
        String rank = Integer.toString(getRank());
        switch (rank) {
            case "10":
                rank = data[0];
                break;
            case "11":
                rank = data[1];
                break;
            case "12":
                rank = data[2];
                break;
            case "13":
                rank = data[3];
                break;
            case "14":
                rank = data[4];
                break;
        }
        return rank;
    }
    public boolean equals(Card card){
        return this.rank == card.rank && this.suit == card.suit;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.rank, this.suit);
    }
    public boolean isStandart(){
        return !(this.rank < 6) && !(this.rank > 14);
    }
    public int isGreater(Card card) {
        return Integer.compare(this.rank, card.rank);
    }
    public int cardEquals(Card card){
        String [] data = {"clubs", "diamonds", "spades", "hearts"};
        return Arrays.asList(data).indexOf(this.suit)-Arrays.asList(data).indexOf(card.suit);
    }
    public static int cardEquals(Card card1, Card card2){
        String [] data = {"clubs", "diamonds", "spades", "hearts"};
        return Arrays.asList(data).indexOf(card1.suit)-Arrays.asList(data).indexOf(card2.suit);
    }
}
