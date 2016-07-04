package com.gamila.zm.twitterclient;

import android.app.Application;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.*;

import io.fabric.sdk.android.Fabric;
import timber.log.Timber;

/**
 * Created by zeinab on 7/4/2016.
 */
public class TwitterClientApplication  extends Application {


    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "iqYLetpdzBY5yM3ARwdEN1xmp";
    private static final String TWITTER_SECRET = "4sctfbT8hwcvcF7xFPt9XabNps0UWolBWysKlJv35Le4qi00x6";

    @Override
    public void onCreate() {
        super.onCreate();

        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));

        if(android.support.v4.BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree(){
                @Override
                protected String createStackElementTag(StackTraceElement element) {
                    return super.createStackElementTag(element)+" : "+ element.getLineNumber();
                }
            });
        }else {
            Timber.plant(new ReleaseTimberTree());
        }

    }










}
