package org.schabi.newpipe.events;

import org.junit.Test;
import org.schabi.newpipe.player.playqueue.events.SelectEvent;

import static org.junit.Assert.assertEquals;

public class SelectEventTest {
    @Test
    public void checkInit() {
        final int mockOld = 0;
        final int mockNew = 23;
        SelectEvent mockSelect = new SelectEvent(mockOld, mockNew);
        assertEquals(0, mockSelect.getOldIndex());
        assertEquals(23, mockSelect.getNewIndex());
    }
}
