package FIZZBUZZ;

import FIZZBUZZ.FizzBuzz;
import org.junit.jupiter.api.Test;

import static FIZZBUZZ.FizzBuzz.BUZZ;
import static FIZZBUZZ.FizzBuzz.FIZZ;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void testFizz3() {
        int number = 3;
        String expected = FizzBuzz.FIZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizz6() {
        int number = 6;
        String expected = FizzBuzz.FIZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testBuzz5() {
        int number = 5;
        String expected = FizzBuzz.BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testBuzz10() {
        int number = 10;
        String expected = FizzBuzz.BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz15() {
        int number = 15;
        String expected = FizzBuzz.FIZZBUZZ;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz30() {
        int number = 30;
        String expected = FizzBuzz.FIZZBUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}