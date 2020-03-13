package org.schabi.newpipe.report;

import android.app.Activity;
import android.os.Parcel;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.schabi.newpipe.MainActivity;
import org.schabi.newpipe.R;
import org.schabi.newpipe.RouterActivity;
import org.schabi.newpipe.fragments.detail.VideoDetailFragment;
import org.schabi.newpipe.report.ErrorActivity.ErrorInfo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Instrumented tests for {@link ErrorInfo}
 */
@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class ErrorInfoTest {

    @Test
    public void errorInfo_testParcelable() {
        ErrorInfo info = ErrorInfo.make(UserAction.USER_REPORT, "youtube", "request", R.string.general_error);
        // Obtain a Parcel object and write the parcelable object to it:
        Parcel parcel = Parcel.obtain();
        info.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        ErrorInfo infoFromParcel = ErrorInfo.CREATOR.createFromParcel(parcel);

        assertEquals(UserAction.USER_REPORT, infoFromParcel.userAction);
        assertEquals("youtube", infoFromParcel.serviceName);
        assertEquals("request", infoFromParcel.request);
        assertEquals(R.string.general_error, infoFromParcel.message);

        parcel.recycle();
    }

    @Test
    public void getReturnActivity() {
        Class<? extends Activity> returnActivity;
        returnActivity = ErrorActivity.getReturnActivity(MainActivity.class);
        assertEquals(MainActivity.class, returnActivity);

        returnActivity = ErrorActivity.getReturnActivity(RouterActivity.class);
        assertEquals(RouterActivity.class, returnActivity);

        returnActivity = ErrorActivity.getReturnActivity(null);
        assertNull(returnActivity);

        returnActivity = ErrorActivity.getReturnActivity(Integer.class);
        assertEquals(MainActivity.class, returnActivity);

        returnActivity = ErrorActivity.getReturnActivity(VideoDetailFragment.class);
        assertEquals(MainActivity.class, returnActivity);
    }

}