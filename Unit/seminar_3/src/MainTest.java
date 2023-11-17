package GB.Unit.seminar_3.src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void evenOddNumber() {
        assertTrue(Main.evenOddNumber(2));
        assertFalse(Main.evenOddNumber(3));
    }

    @Test
    void numberInInterval() {
        assertTrue(Main.numberInInterval(26));
        assertFalse(Main.numberInInterval(111));
    }
}
