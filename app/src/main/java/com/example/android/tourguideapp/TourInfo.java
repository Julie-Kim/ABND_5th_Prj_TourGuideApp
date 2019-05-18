package com.example.android.tourguideapp;

class TourInfo {

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

    TourInfo(int titleResId, int descriptionResId, int imageResId, int addressResId, int hoursResId, int phoneResId, int linkResId) {
        mTitleResId = titleResId;
        mDescriptionResId = descriptionResId;
        mImageResId = imageResId;
        mAddressResId = addressResId;
        mOpeningHoursResId = hoursResId;
        mPhoneResId = phoneResId;
        mLinkResId = linkResId;
    }

    int getTitleResId() {
        return mTitleResId;
    }

    int getDescriptionResId() {
        return mDescriptionResId;
    }

    int getImageResId() {
        return mImageResId;
    }

    int getAddressResId() {
        return mAddressResId;
    }

    int getOpeningHoursResId() {
        return mOpeningHoursResId;
    }

    int getPhoneResId() {
        return mPhoneResId;
    }

    int getLinkResId() {
        return mLinkResId;
    }
}