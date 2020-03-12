package events;

import org.junit.Test;
import org.schabi.newpipe.player.playqueue.events.AppendEvent;

import static org.junit.Assert.assertEquals;


public class AppendEventTest {
    @Test
    public void checkAmount() {
        AppendEvent test = new AppendEvent(4);
        assertEquals(4, test.getAmount());
    }
}
