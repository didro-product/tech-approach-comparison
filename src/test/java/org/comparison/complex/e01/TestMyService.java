package org.comparison.complex.e01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link MyService} class.
 *
 * @author Didro
 */
public class TestMyService {

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(-20, true, null);
        Assertions.assertEquals("-20null-20", actualResult);
    }

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(-22, true, null);
        Assertions.assertEquals("-22null10", actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(11, true, "________");
        Assertions.assertEquals("11________11", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(-5, true, "________");
        Assertions.assertEquals("-5________-5", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals("2null5", actualResult);
    }

    @Test
    public void testDetermineValue_9() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(-22, true, "________");
        Assertions.assertEquals("-22________-34", actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(9, false, "________");
        Assertions.assertEquals("9________14", actualResult);
    }

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(11, false, "________");
        Assertions.assertEquals("11________8", actualResult);
    }

}

