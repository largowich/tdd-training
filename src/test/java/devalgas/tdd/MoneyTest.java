package devalgas.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author devalgas kamga.
 */
public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product  = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEquality(){
        assertEquals(new Dollar(8), new Dollar(8));
        assertNotEquals(new Dollar(5), new Dollar(15));
    }
}
