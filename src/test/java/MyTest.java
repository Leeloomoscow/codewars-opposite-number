import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void tests() {
        assertEquals(-1, Kata.opposite(1));
    }

    private static class Kata {
        public static int opposite(int number) {
            int result = -1 * (number);
            return result;
        }
    }
}