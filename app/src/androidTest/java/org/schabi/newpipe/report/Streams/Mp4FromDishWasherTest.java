package org.schabi.newpipe.report.Streams;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.schabi.newpipe.streams.Mp4FromDashWriter;
import org.schabi.newpipe.streams.io.SharpStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

public class Mp4FromDishWasherTest {
    @Test
    public void buildWasherTest() throws IOException {
        SharpStream newSStream = new SharpStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }

            @Override
            public int read(byte[] buffer) throws IOException {
                return 0;
            }

            @Override
            public int read(byte[] buffer, int offset, int count) throws IOException {
                return 0;
            }

            @Override
            public long skip(long amount) throws IOException {
                return 0;
            }

            @Override
            public long available() {
                return 0;
            }

            @Override
            public void rewind() throws IOException {

            }

            @Override
            public boolean isClosed() {
                return false;
            }

            @Override
            public void close() {

            }

            @Override
            public boolean canRewind() {
                return true;
            }

            @Override
            public boolean canRead() {
                return true;
            }

            @Override
            public boolean canWrite() {
                return true;
            }

            @Override
            public void write(byte value) throws IOException {

            }

            @Override
            public void write(byte[] buffer) throws IOException {

            }

            @Override
            public void write(byte[] buffer, int offset, int count) throws IOException {

            }
        };
        Mp4FromDashWriter newmp4dw = new Mp4FromDashWriter(newSStream);
        boolean doneResult = newmp4dw.isDone();
        assertFalse(doneResult);
        newmp4dw.close();
    };
}

