import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    private int sumOfValues() {
        int sum = 0;

        for (Card card : cards) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand hand) {
        return this.sumOfValues() - hand.sumOfValues();
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

}
