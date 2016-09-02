package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by TroysMacBook on 8/28/16.
 */

public class AsyncTaskTest extends AndroidTestCase {

    @Test
    public void EndpointsTest() throws ExecutionException, InterruptedException, TimeoutException {
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(getContext());
        String taskString = task.get(20, TimeUnit.SECONDS);

        assertNotNull(taskString);
    }

}
