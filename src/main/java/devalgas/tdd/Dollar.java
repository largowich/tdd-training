package devalgas.tdd;

/**
 * @author devalgas kamga.
 */
public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount= amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
