import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {
    @Test
    public void testNextDay1() {
        assertEquals("2/1/2018", NextDayCalculator.findNextDay(1, 1, 2018));
    }
    @Test
    public void testNextDayEndOfMonth() {
        assertEquals("1/2/2018", NextDayCalculator.findNextDay(31, 1, 2018));
    }
    @Test
    public void testNextDayApril30() {
        assertEquals("1/5/2018", NextDayCalculator.findNextDay(30, 4, 2018));
    }
    @Test
    public void testNextDayFeb28Normal() {
        assertEquals("1/3/2018", NextDayCalculator.findNextDay(28, 2, 2018));
    }
    @Test
    public void testNextDayFeb29Leap() {
        assertEquals("1/3/2020", NextDayCalculator.findNextDay(29, 2, 2020));
    }
    @Test
    public void testNextDayEndOfYear() {
        assertEquals("1/1/2019", NextDayCalculator.findNextDay(31, 12, 2018));
    }
}
