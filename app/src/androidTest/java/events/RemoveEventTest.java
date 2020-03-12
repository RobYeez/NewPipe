package events;

import org.junit.Test;
import org.schabi.newpipe.player.playqueue.events.RemoveEvent;

import static org.junit.Assert.assertEquals;

public class RemoveEventTest {
    @Test
    public void checkRemoval() {
        final int mockRemoveIndex = 2;
        final int mockIndex = 28;
        RemoveEvent mockRemove = new RemoveEvent(mockRemoveIndex, mockIndex);
        assertEquals(2, mockRemove.getRemoveIndex());
        assertEquals(28, mockRemove.getQueueIndex());
    }
}
