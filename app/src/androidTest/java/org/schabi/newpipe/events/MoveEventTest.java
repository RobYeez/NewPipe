package org.schabi.newpipe.events;

import org.junit.Test;
import org.schabi.newpipe.player.playqueue.events.MoveEvent;
import org.schabi.newpipe.player.playqueue.events.PlayQueueEvent;


import static org.junit.Assert.assertEquals;

public class MoveEventTest {
    @Test
    public void moveTest() {
        final int mockOld = 1;
        final int mockNew = 2;
        MoveEvent mockMove = new MoveEvent(mockOld, mockNew);
        assertEquals(1, mockMove.getFromIndex());
        assertEquals(2, mockMove.getToIndex());
    }

    @Test
    public void negativeIndex() {
        final int mockOld = -1;
        final int mockNew = 2;
        MoveEvent mockMove = new MoveEvent(mockOld, mockNew);
        assertEquals(-1, mockMove.getFromIndex());
        assertEquals(2, mockMove.getToIndex());
    }
}
