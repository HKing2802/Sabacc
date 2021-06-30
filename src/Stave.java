public enum Stave {
    CIRCLE("c"),
    SQUARE("s"),
    TRIANGLE("t"),
    ZERO("");

    private String symbol;

    Stave(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
