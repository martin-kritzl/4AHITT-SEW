package at.mkritzl.ant.test;

import at.mkritzl.ant.data.Hello;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Martin Kritzl on 09.01.2015.
 */
public class MySecondTest {

    @Test
    public void testBool() {
        assertEquals(false, false);
    }

    @Test
    public void testName() {
        assertEquals("Martin", new Hello().getName());
    }

}
