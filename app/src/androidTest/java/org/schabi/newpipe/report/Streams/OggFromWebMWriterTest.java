package org.schabi.newpipe.report.Streams;

import androidx.annotation.NonNull;

import org.junit.Test;
import org.schabi.newpipe.streams.OggFromWebMWriter;
import org.schabi.newpipe.streams.io.SharpStream;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

public class OggFromWebMWriterTest {
    @Test
    public void OggConstructor() throws IOException {
        @NonNull
        SharpStream source = new SharpStream() {
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
        @NonNull
        SharpStream output = new SharpStream() {
            @Override
            public int read() throws IOException {
                return 10;
            }

            @Override
            public int read(byte[] buffer) throws IOException {
                return 10;
            }

            @Override
            public int read(byte[] buffer, int offset, int count) throws IOException {
                return 10;
            }

            @Override
            public long skip(long amount) throws IOException {
                return 1;
            }

            @Override
            public long available() {
                return 10;
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
        OggFromWebMWriter newOgg = new OggFromWebMWriter(source, output);
        assertFalse(newOgg.isDone());
        assertFalse(newOgg.isParsed());
        newOgg.close();
    }
}
