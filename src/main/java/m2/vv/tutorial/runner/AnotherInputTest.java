package m2.vv.tutorial.runner;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AnotherInputTest {

    @Test
    public void shouldFail() {
        assertArrayEquals(new int[] {1, 2}, new int[] {3, 4});
    }

    @Test
    public void shouldPass() {
        Assert.assertArrayEquals(new int[]{1, 2}, new int[]{1,2});
    }

}
