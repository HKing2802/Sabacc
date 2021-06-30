import java.util.LinkedList;
import java.util.List;

/****
 * Class for a player, user or AI
 *
 * @author HKing
 */
public class Player {
    // the cards in the player's hand
    private final List<Card> hand;

    // the total score of the hand
    private int handScore;

    /**
     * Initializes the player class with an empty hand
     * and a hand score of zero
     */
    public Player() {
        this.hand = new LinkedList<>();
        this.handScore = 0;
    }

    public List<Card> getHand() {
        return this.hand;
    }

    public int getHandScore() {
        return this.handScore;
    }

    public int getNumCards() {
        return this.hand.size();
    }

    /**
     * Adds a card to the hand, and its value to the
     * hand score
     * @param card The card to be added
     */
    public void addCard(Card card) {
        if (card != null) {
            this.hand.add(card);
            this.handScore += card.getValue();
        }
    }

    /**
     * Clears the hand and sets the hand score
     * to zero
     */
    public void clearHand() {
        this.hand.clear();
        this.handScore = 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hand:\n");

        int cardCount = 0;
        for (Card c : this.hand) {
            sb.append(c);
            cardCount++;

            // adds a new line after every 7 cards for
            // better formatting
            if (cardCount >= 7) {
                sb.append("\n");
                cardCount = 0;
            } else {
                sb.append(" ");
            }
        }

        sb.append("\nHand Score: ").append(this.handScore).append("\n");
        return sb.toString();
    }
}
