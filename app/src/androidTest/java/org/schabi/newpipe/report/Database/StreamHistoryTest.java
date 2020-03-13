package org.schabi.newpipe.report.Database;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.exoplayer2.source.MediaSource;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.schabi.newpipe.database.stream.StreamStatisticsEntry;
import org.schabi.newpipe.extractor.stream.StreamInfo;
import org.schabi.newpipe.extractor.stream.StreamType;
import org.schabi.newpipe.player.BasePlayer;
import org.schabi.newpipe.player.playqueue.PlayQueueItem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

public class StreamHistoryTest {
    // @Test
// public void StreamHistoryEntryTest() {
// long streamUid = 123456789;
// Date accessDate = new Date();
// long repeatCnt = 123;
// String search = "Rain";
// StreamHistoryEntity newStream = new StreamHistoryEntity(streamUid, accessDate, repeatCnt);
// }
    public StreamType streamType;
    @Test
    public void StreamStatsTest() {
        long uid = 123456;
        int serviceId = 12;
        String url = "www.TEST.com";
        String title = "TEST_TITLE";
        long duration = 123;
        String uploader = "TEST_UPLOAD";
        String thumbnailUrl = "TEST_URL";
        long streamId = 1234567;
        Date latestAccessDate = new Date();
        long watchCount = 1234;
        StreamStatisticsEntry newStat = new StreamStatisticsEntry(uid,
                serviceId, url, title, streamType, duration, uploader, thumbnailUrl, streamId, latestAccessDate, watchCount);

    }

    /*
    // this is for base handleIntent
    @NotNull Context context;
    @NotNull Intent intent;

    @Test
    public void handleIntentTest() {
        BasePlayer something = new BasePlayer(context) {

            @Nullable
            @Override
            public MediaSource sourceOf(PlayQueueItem item, StreamInfo info) {
                return null;
            }

            @Override
            public void onUpdateProgress(int currentProgress, int duration, int bufferPercent) {

            }
        };
        something.handleIntent(intent);
    }
    */
}