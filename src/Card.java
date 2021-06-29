public class Card {
    private final int value;
    private final Stave stave;

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

    //TODO: toString
}
