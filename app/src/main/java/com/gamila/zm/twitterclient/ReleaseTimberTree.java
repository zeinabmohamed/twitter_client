package com.gamila.zm.twitterclient;

import android.util.Log;

import timber.log.Timber;

/**
 * Created by zeinab on 7/4/2016.
 */
public class ReleaseTimberTree extends Timber.Tree {
    @Override
    protected boolean isLoggable(int priority) {

        // to disable Debug and verbose and info logs in release case
        if(priority == Log.VERBOSE || priority == Log.DEBUG || priority == Log.INFO){
            return false;
        }
        return true;
    }

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {

    }
}
