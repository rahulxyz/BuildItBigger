package com.udacity.gradle.builditbigger;

/**
 * Created by raul_Will on 10/11/2017.
 */

import android.content.Context;
import android.test.AndroidTestCase;
import org.mockito.Mock;
import java.util.concurrent.TimeUnit;

public class AsyncTester extends AndroidTestCase {

    EndpointsAsyncTask mAsync;
    String mResult;
    @Mock
    Context mContext;


    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mResult = null;
        mAsync = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String data) {

            }
        };
    }

    public void testAsyncReturnType() {

        try {
            mAsync.execute(mContext);
            mResult = mAsync.get(6, TimeUnit.SECONDS);
            assertNotNull(mResult);

        } catch (Exception e) {
            fail("Download not completed in Time");
        }
    }





}