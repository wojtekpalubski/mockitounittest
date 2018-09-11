package com.wpe.unittest.BowlingGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingTest {

    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void canRoll() {
        g.roll(0);
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);
        Assert.assertEquals(0, g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    @Test
    public void allOnes() {
        rollMany(20, 1);
        Assert.assertEquals(20, g.score());
    }
}
