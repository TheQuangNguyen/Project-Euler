package Project.Euler;

import org.junit.Test;
import static Project.Euler.MultiplesOf3And5.*;

import static org.junit.Assert.*;

public class MultiplesOf3And5Test {

    @Test
    public void multiplesOf3And5Test() {
        int answer = multiplesOf3And5(1000);
        assertEquals(23, answer);
    }
}