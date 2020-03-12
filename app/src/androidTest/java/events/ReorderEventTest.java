package events;

import org.junit.Test;
import org.schabi.newpipe.player.playqueue.events.ReorderEvent;

import static org.junit.Assert.assertEquals;

public class ReorderEventTest {
    @Test
    public void checkReorder() {
        final int mockFrom = 4;
        final int mockTo = 1;
        ReorderEvent mockReorder = new ReorderEvent(mockFrom, mockTo);
        assertEquals(4, mockReorder.getFromSelectedIndex());
        assertEquals(1, mockReorder.getToSelectedIndex());
    }
}
