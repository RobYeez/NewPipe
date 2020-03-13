package org.schabi.newpipe.events;

import org.junit.Test;
import org.schabi.newpipe.player.playqueue.events.ErrorEvent;

import static org.junit.Assert.assertEquals;

public class ErrorEventTest {
    @Test
    public void validError() {
        final int errorIndex = 1;
        final int queueIndex = 10;
        final boolean skippable = true;
        ErrorEvent mockError = new ErrorEvent(errorIndex, queueIndex, skippable);
        assertEquals(1, mockError.getErrorIndex());
        assertEquals(10, mockError.getQueueIndex());
        assertEquals(true, mockError.isSkippable());
    }
}
