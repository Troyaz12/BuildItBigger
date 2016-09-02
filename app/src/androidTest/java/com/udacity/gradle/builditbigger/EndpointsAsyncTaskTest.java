package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by TroysMacBook on 9/2/16.
 */

@RunWith(AndroidJUnit4.class)
@SmallTest
public class EndpointsAsyncTaskTest {
    @Mock
    Context mContext;

    public EndpointsAsyncTask newTask;
    public String result;
    @Before
    public void createAsyncTask(){
        newTask = (EndpointsAsyncTask) new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String joke){
            }

        }.execute(mContext);
    }
    @Test
    public void testReturnValue(){

        try {
            result = newTask.get(25, TimeUnit.SECONDS);
            assertThat(result, is(IsNull.notNullValue()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }



    }


}
