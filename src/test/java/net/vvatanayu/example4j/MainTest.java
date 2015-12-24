package net.vvatanayu.example4j;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testExecute() throws Exception {
        assertEquals(1, new Main().execute(1));
    }

}
