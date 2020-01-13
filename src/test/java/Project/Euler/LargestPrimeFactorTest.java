package Project.Euler;

import org.junit.Test;

import static org.junit.Assert.*;
import static Project.Euler.LargestPrimeFactor.*;

public class LargestPrimeFactorTest {

    @Test
    public void largestPrimeFactorTest() {
        long largestPrime = largestPrimeFactor(600851475143);
        assertEquals(5, largestPrime);
    }
}