package org.schabi.newpipe.report;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.schabi.newpipe.streams.DataReader;
import org.schabi.newpipe.streams.io.SharpStream;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class DataReadTest {


    @Test
    public void readByteTest() throws Exception {
        @NotNull byte[] buffer = new byte[10];
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
                return false;
            }

            @Override
            public boolean canRead() {
                return false;
            }

            @Override
            public boolean canWrite() {
                return false;
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
        DataReader newDataRead = new DataReader(newSStream);
        long result = newDataRead.position();
        assertEquals(0, result);
        long results= newDataRead.skipBytes(0); //cant test since sharpStream null
        assertEquals(0, results);
        long resultss = newDataRead.read(buffer, 15, 30);

    }
}
