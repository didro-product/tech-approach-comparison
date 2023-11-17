package org.comparison.complex.e08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link MyService} class.
 *
 * @author Didro
 */
public class TestMyService {

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(9, true, null);
        Assertions.assertEquals(44, actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(76, true, "________");
        Assertions.assertEquals(684, actualResult);
    }

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(76, true, null);
        Assertions.assertEquals(152, actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(43, true, "________");
        Assertions.assertEquals(843, actualResult);
    }

    @Test
    public void testDetermineValue_8() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(43, true, null);
        Assertions.assertEquals(143, actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, "________");
        Assertions.assertEquals(322, actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals(42, actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(9, true, "________");
        Assertions.assertEquals(289, actualResult);
    }

}

