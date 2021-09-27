package com.example.googlesignin.youtube;

import com.google.api.services.youtube.model.Subscription;

/**
 * Created by admin on 16-Oct-17.
 */

public interface YouTubeActivityView {
    void onSubscribetionSuccess(String title);

    void onSubscribetionFail(Subscription subscription);

}
