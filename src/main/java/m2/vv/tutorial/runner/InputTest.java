package m2.vv.tutorial.runner;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class InputTest {

    @Test
    public void shoudlPass() {
        assertTrue(true);
    }


    @Test
    public void shoudlFail() {
        fail("This test should fail");
    }


    @Test
    @Ignore
    public void shouldBeIgnored() {
        fail();
    }

}
