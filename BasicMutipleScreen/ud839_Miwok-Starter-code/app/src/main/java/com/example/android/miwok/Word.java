package com.example.android.miwok;

/**
 * Created by KAZDO on 17/4/2560.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED=-1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageId;
    private int mAudioResourcceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        imageId = NO_IMAGE_PROVIDED;
        mAudioResourcceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.imageId=imageId;
        mAudioResourcceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageId() {return imageId;}

    public int getAudioResouceId() {return mAudioResourcceId;}

    public boolean hasImage() {return imageId != NO_IMAGE_PROVIDED;}

    //from alt+Insert
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", imageId=" + imageId +
                ", mAudioResourcceId=" + mAudioResourcceId +
                '}';
    }
}
