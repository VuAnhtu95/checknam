import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void checkCase1() {
        int day = 20;
        int month = 2;
        int year = 2020;
        String result = NextDayCalculator.check(day,month,year);
        String expected = (day+1) + "/" + month + "/" + year;
        assertEquals(expected, result);
    }
    @Test
    void checkCase2() {
        int day = 2;
        int month = 5;
        int year = 2020;
        String result = NextDayCalculator.check(day,month,year);
        String expected = (day+1) + "/" + month + "/" + year;
        assertEquals(expected, result);
    }
}