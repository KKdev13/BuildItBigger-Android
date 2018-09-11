package com.udacity.gradle.builditbigger;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Deniz Kalem on 08.11.17.
 */
@RunWith(AndroidJUnit4.class)
public class FunctionalTest
{

    @Test
    public void retrievesNonEmptyString()
    {
        String joke = null;

        try
        {
            JokeAsyncTask jokeAsyncTask = new JokeAsyncTask();
            jokeAsyncTask.execute(InstrumentationRegistry.getTargetContext());
            joke = jokeAsyncTask.get(30, TimeUnit.SECONDS);
        } catch(Exception e)
        {
            /*if (joke == null || joke.isEmpty()) {
                e.printStackTrace();
            }*/
            assertFalse(TextUtils.isEmpty(joke));
            e.printStackTrace();

        }

        assertNotNull(joke);
    }
}