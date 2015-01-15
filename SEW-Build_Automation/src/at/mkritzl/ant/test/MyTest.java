package at.mkritzl.ant.test;

import at.mkritzl.ant.data.Hello;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Martin Kritzl on 08.01.2015.
 */
public class MyTest {

    @Test
    public void testBool() {
        assertEquals(true, true);
    }

    @Test
    public void testName() {
        assertEquals("Martin", new Hello().getName());
    }
}
