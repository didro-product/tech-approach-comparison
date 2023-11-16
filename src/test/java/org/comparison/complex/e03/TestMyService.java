package org.comparison.complex.e03;

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
        String actualResult = testedInstance.determineValue(14, false, "________");
        Assertions.assertEquals("14________8", actualResult);
    }

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(20, true, null);
        Assertions.assertEquals("20null3", actualResult);
    }

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(16, false, "________");
        Assertions.assertEquals("16________-6", actualResult);
    }

    @Test
    public void testDetermineValue_8() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(20, true, "________");
        Assertions.assertEquals("20________-4", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(14, true, "________");
        Assertions.assertEquals("14________8", actualResult);
    }

    @Test
    public void testDetermineValue_9() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(16, true, "________");
        Assertions.assertEquals("16________9", actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, true, null);
        Assertions.assertEquals("2null2", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals("2null1", actualResult);
    }

}

