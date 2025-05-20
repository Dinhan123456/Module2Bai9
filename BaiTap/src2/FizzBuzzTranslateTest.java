import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    public void testFizzBuzzMultiples() {
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
        assertEquals("Fizz", FizzBuzzTranslate.translate(3));
        assertEquals("Buzz", FizzBuzzTranslate.translate(5));
        assertEquals("Fizz", FizzBuzzTranslate.translate(6));
        assertEquals("Buzz", FizzBuzzTranslate.translate(10));
    }
    @Test
    public void testContains3or5(){
        assertEquals("Fizz", FizzBuzzTranslate.translate(13));
        assertEquals("Buzz", FizzBuzzTranslate.translate(52));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(35));
    }
    @Test
    public void testNumberToWord(){
        assertEquals("hai", FizzBuzzTranslate.translate(2));
        assertEquals("hai mươi sáu", FizzBuzzTranslate.translate(26));
        assertEquals("bốn mươi chín", FizzBuzzTranslate.translate(49));
    }
}
