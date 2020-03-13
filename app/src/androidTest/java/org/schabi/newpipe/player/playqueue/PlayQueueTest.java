package org.schabi.newpipe.player.playqueue;

import androidx.annotation.NonNull;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlayQueueTest {
    final int mockIndex = 0;
    final List<PlayQueueItem> mockStartWith = new ArrayList<PlayQueueItem>();

    @Test
    public void initPlayQueue() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.init();
    }

    @Test
    public void nullDispose() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.dispose();
        assertEquals(null, mockPlayQueue.getBroadcastReceiver());
    }

    @Test
    public void autoFunctions() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.isShuffled();
        mockPlayQueue.getStreams();
    }

    @Test
    public void setIndex() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        final int mockIndex1 = 19;
        final int mockIndex2 = 20;
        mockPlayQueue.setIndex(mockIndex1);
        mockPlayQueue.setIndex(mockIndex2);
        assertEquals(-1, mockPlayQueue.getIndex());
    }

    @Test
    public void negativeIndex() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        final int mockIndex1 = -1;
        mockPlayQueue.setIndex(mockIndex1);
        assertEquals(0, mockPlayQueue.getIndex());
    }

    @Test
    public void offSetIndex() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        final int mockOffset = 4;
        mockPlayQueue.offsetIndex(mockOffset);
        assertEquals(-1, mockPlayQueue.getIndex());
    }

    @Test
    public void emptyPlayQueue() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        assertEquals(true, mockPlayQueue.isEmpty());
    }

    @Test
    public void appendRemovePlayQueue() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.append();
        mockPlayQueue.remove(-1);
    }

    @Test
    public void removePlayQueue() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.append();
        mockPlayQueue.remove(1);
    }


    @Test
    public void skippableTrue() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.error(true);
    }

    @Test
    public void move() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.move(0,1);
    }

    @Test
    public void setRecovery() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.append();
        mockPlayQueue.setRecovery(-1, 324);
    }

    @Test
    public void setRecoveryGreater() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.append();
        mockPlayQueue.setRecovery(1, 3224);
    }

    @Test
    public void unsetRecovery() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.unsetRecovery(-1);
    }

    @Test
    public void shuffling() {
        @NonNull
        PlayQueue mockPlayQueue = new PlayQueue(mockIndex, mockStartWith) {
            @Override
            public boolean isComplete() {
                return false;
            }

            @Override
            public void fetch() {

            }
        };
        mockPlayQueue.unshuffle();
        mockPlayQueue.shuffle();
    }

}
