package events;

import org.junit.Test;
import org.schabi.newpipe.player.playqueue.events.InitEvent;
import org.schabi.newpipe.player.playqueue.events.PlayQueueEventType;

import static org.junit.Assert.assertEquals;

public class InitEventTest {
    @Test
    public void checkInit() {
        InitEvent mockEvent = new InitEvent();
        PlayQueueEventType mockResult = mockEvent.type();
        assertEquals(PlayQueueEventType.INIT, mockResult);
    }
}
