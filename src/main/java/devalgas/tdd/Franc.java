package devalgas.tdd;

/**
 * @author devalgas kamga.
 */
public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount= amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    public boolean equals(Object obj) {
        Franc dollar = (Franc) obj;
        return amount == dollar.amount;
    }
}
