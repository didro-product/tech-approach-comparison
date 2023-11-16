package org.comparison.complex.e04;

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
        String actualResult = testedInstance.determineValue(21, false, "________");
        Assertions.assertEquals("21________20", actualResult);
    }

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, true, null);
        Assertions.assertEquals("2null7", actualResult);
    }

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(19, false, "________");
        Assertions.assertEquals("19________8", actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(21, true, "________");
        Assertions.assertEquals("21________104", actualResult);
    }

    @Test
    public void testDetermineValue_8() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(19, true, "________");
        Assertions.assertEquals("19________8", actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(11, true, null);
        Assertions.assertEquals("11null1", actualResult);
    }

    @Test
    public void testDetermineValue_9() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(11, true, "________");
        Assertions.assertEquals("11________8", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals("2null5", actualResult);
    }

}

