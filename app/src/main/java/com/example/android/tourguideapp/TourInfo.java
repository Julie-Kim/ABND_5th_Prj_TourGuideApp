package com.example.android.tourguideapp;

public class TourInfo {

    /**
     * Constant value that represents no image was provided
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    // 1. title - resource id
    private int mTitleResId;

    // 2. description (about) - resource id
    private int mDescriptionResId;

    // 3. picture (photo) - resource id
    private int mImageResId;

    // 4. address or location - resource id
    private int mAddressResId;

    // 5. days of operation or event dates, or opening hours - resource id
    private int mOpeningHoursResId;

    // 6. phone number or email - resource id
    private int mPhoneResId;

    // 7. website or link (view more) - resource id
    private int mLinkResId;

    public TourInfo(int titleResId, int descriptionResId, int addressResId, int hoursResId, int phoneResId, int linkResId) {
        this(titleResId, descriptionResId, NO_IMAGE_PROVIDED, addressResId, hoursResId, phoneResId, linkResId);
    }

    public TourInfo(int titleResId, int descriptionResId, int imageResId, int addressResId, int hoursResId, int phoneResId, int linkResId) {
        mTitleResId = titleResId;
        mDescriptionResId = descriptionResId;
        mImageResId = imageResId;
        mAddressResId = addressResId;
        mOpeningHoursResId = hoursResId;
        mPhoneResId = phoneResId;
        mLinkResId = linkResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getDescriptionResId() {
        return mDescriptionResId;
    }

    public int getImageResId() {
        return mImageResId;
    }

    public int getAddressResId() {
        return mAddressResId;
    }

    public int getOpeningHoursResId() {
        return mOpeningHoursResId;
    }

    public int getPhoneResId() {
        return mPhoneResId;
    }

    public int getLinkResId() {
        return mLinkResId;
    }

    /**
     * Returns whether or not there is an image
     */
    public boolean hasImage() {
        return mImageResId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "TourInfo{" +
                "mTitleResId='" + mTitleResId + '\'' +
                ", mDescriptionResId='" + mDescriptionResId + '\'' +
                ", mImageResId=" + mImageResId +
                ", mAddress='" + mAddressResId + '\'' +
                ", mOpeningHoursResId='" + mOpeningHoursResId + '\'' +
                ", mPhoneResId='" + mPhoneResId + '\'' +
                ", mLinkResId='" + mLinkResId + '\'' +
                '}';
    }
}