package Project.Euler;

import org.junit.Test;
import static Project.Euler.EvenFibonacciNumbers.*;
import static org.junit.Assert.*;

public class EvenFibonacciNumbersTest {

    @Test
    public void evenFibNumbersTest() {
        int answer = evenFibNumbers(4000000);
        assertEquals(4613732, answer);
    }
}