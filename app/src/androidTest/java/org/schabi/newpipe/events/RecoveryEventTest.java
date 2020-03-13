package org.schabi.newpipe.events;

import org.junit.Test;
import org.schabi.newpipe.player.playqueue.events.RecoveryEvent;

import static org.junit.Assert.assertEquals;

public class RecoveryEventTest {
    @Test
    public void checkRecoveryPosition() {
        final int mockIndex = 49;
        final long mockPosition = 139392;
        RecoveryEvent mockRecovery = new RecoveryEvent(mockIndex, mockPosition);
        assertEquals(49, mockRecovery.getIndex());
        assertEquals(139392, mockRecovery.getPosition());
    }
}
