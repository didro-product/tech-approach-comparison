package org.comparison.complex.e02;

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
        String actualResult = testedInstance.determineValue(9, true, null);
        Assertions.assertEquals("30null9", actualResult);
    }

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(11, true, null);
        Assertions.assertEquals("11null11", actualResult);
    }

    @Test
    public void testDetermineValue_8() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(26, true, "________");
        Assertions.assertEquals("26________26", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(9, true, "________");
        Assertions.assertEquals("60________9", actualResult);
    }

    @Test
    public void testDetermineValue_9() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(18, true, "________");
        Assertions.assertEquals("18________18", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals("10null2", actualResult);
    }

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(26, false, "________");
        Assertions.assertEquals("18________26", actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(24, false, "________");
        Assertions.assertEquals("20________24", actualResult);
    }

}

