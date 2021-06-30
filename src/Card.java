/**
 * Class to represent a singular Sabacc card
 *
 * @author HKing
 */
public class Card {
    // the numerical value of the card
    private final int value;

    // the stave (or suit) of the card
    private final Stave stave;

    /**
     * Initializes a Card with a given value and stave
     * @param value The numerical value of the card
     * @param stave The stave of the card
     */
    public Card(int value, Stave stave) {
        this.value = value;
        this.stave = stave;
    }

    public int getValue() {
        return this.value;
    }

    public Stave getStave() {
        return this.stave;
    }

    @Override
    public String toString() {

        return null;
    }
}
